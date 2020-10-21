package com.bdqn.program.myshops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ShopcarCtrl {
    @Autowired
    private StringRedisTemplate template;
    private final static String SUCCESS="{\"statu\":\"200\"}";

    @RequestMapping("/savecart")
    public String saveGoodsToShopcart(int uid,int goodid,int buynum){
        //先检查该用户是否有购物车
        if (template.opsForHash().size("car_"+uid)==0){
            //用户还没有购物车
            template.opsForHash().put("cat_"+uid,goodid+"",buynum+"");
        }else {
            //用户已经有购物车，那么就判断是否有该商品
            int orignNum = Integer.parseInt(template.opsForHash().get("car_"+uid,goodid+"").toString());
            template.opsForHash().put("car_"+uid,goodid+"",(orignNum+buynum)+"");
        }
        return SUCCESS;
    }
}
