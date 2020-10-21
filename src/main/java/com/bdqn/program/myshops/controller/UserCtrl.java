package com.bdqn.program.myshops.controller;

import com.bdqn.program.myshops.entity.Customs;
import com.bdqn.program.myshops.model.services.CustomsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class UserCtrl {
    @Autowired
    private CustomsService cs;
    @Autowired
    private StringRedisTemplate template;

    private final static String ERROR="{\"info\":\"用户登录失败！404\"}";

    @InitBinder
    public void dateChange(WebDataBinder wdb){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(true);
        wdb.registerCustomEditor(Date.class,new CustomDateEditor(sdf,true));
    }

    @RequestMapping("/login")
    public String login(String logname,String pwd){
        Customs cst = new Customs();
        cst.setLogname(logname);
        cst.setPwd(pwd);
        //根据用户传入的用户名和密码进行判断
        Customs customs = cs.login(cst);
        if (customs == null){
            return ERROR;
        }else {
            //将用户的信息和私钥存放到redis中
            ObjectMapper om = new ObjectMapper();
            try {
                template.opsForValue().set(customs.getCust_id()+"",om.writeValueAsString(customs));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            //将公钥传送给客户端
            return "{\"info\":\""+customs.getCust_id()+"\"}";
        }
    }
}
