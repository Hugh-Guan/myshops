;(function($){
    var initData = function(){
        //获取用户传来的id
        var uid = location.search.split("=")[1]
        //根据用户的id到后端调用单查接口获取该商品信息 并绑到页面上
        $.ajax({
            url:"http://localhost:8888/goodsById",
            data:{id:uid},
            type:"GET",
            dataType:"JSON",
            success:function (res) {
                //console.log(res);
                $(".shop-info h3").html(res.sku_title)
                $(".shop-info span:eq(0)").html(res.tags)
                $(".shop-info span:eq(1)").html(res.price)
                $(".shop-info span:eq(2)").html(res.content)
                $(".shop-info span:eq(3)").html(res.sku_num)
                $(".shop-info input").attr("max",res.sku_num)
            }
        })
    }
    initData();
    //用户点击购物车按钮，如果用户已经登录过，将私钥和商品编号以及购买数量传送到服务器，否则传跳转至登录界面
    $("button").click(function (){
        var userinfos = window.sessionStorage.getItem("user")
        if (userinfos == null){
            location.href="login.html"
        }else {
            //获取商品编号
            var gid = $("button").attr("lang")
            var buynum = $(".shop-info input").val();
            //将获得的数据送到后天
            $.ajax({
                url:'http://localhost:8080/savecart',
                data: {uid:userinfos,goodid:gid,buynum:buynum},
                type: "GET",
                dataType: "JSON",
                success:function (res) {
                    alert("物品已经存放到购物车中")
                }
            })
        }
    })
})(jQuery);