;(function($){
    //httpClient
    //初始化页面数据
    var initData = function(){
        $.ajax({
            url:"http://localhost:8888/goods",
            type:"GET",
            dataType:"JSON",
            success:function(res) {
                var size = res.size;
                var datas = res.datas;
                console.log(datas)
                //生成对应的数据
                var str='';
                for(var i=0;i<datas.length;i++) {
                    str+=`<div class='col-md-3'><a href='single.html?id=${datas[i].good_id}'><div class='thumbnail'><img src='img/${datas[i].good_img_pos}' alt=''><h6>${datas[i].sku_title}</h6></div></a></div>`;
                }
                $(".shop-list").empty().append(str);
                //console.log(s);
            }
        })
    }
    initData()
})(jQuery);