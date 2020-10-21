;(function ($) {
    $("button").click(function () {
        //获取两个文本框用户的输入
        var username = $(".name").val()
        var password = $(".pwd").val()
        if (username == "" || password == ""){
            alert("请将用户名和密码填写完整！")
            return false;
        }
        //使用ajax将用户名密码传送到后台去，看是否能返回私钥
        $.ajax({
            url:"http://localhost:8080/login",
            data:{logname:username,pwd:password},
            dataType:"JSON",
            type:"POST",
            success:function (res) {
                if (res.info == "用户登录失败！404"){
                    alert("用户名或密码错误，请重新输入！")
                }else {
                    window.sessionStorage.setItem("user",res.info)
                    location.href="index.html";
                }
            }
        })
    })
})(jQuery);