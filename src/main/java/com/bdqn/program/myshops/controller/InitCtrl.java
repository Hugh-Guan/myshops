package com.bdqn.program.myshops.controller;

import com.bdqn.program.myshops.entity.Goods;
import com.bdqn.program.myshops.model.services.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@RestController
public class InitCtrl {
    @Autowired
    private GoodsService gs;

    @InitBinder
    public void dateChange(WebDataBinder wdb){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(true);
        wdb.registerCustomEditor(Date.class,new CustomDateEditor(sdf,true));
    }

    @RequestMapping("/goods")
    public Map findData(@RequestParam(defaultValue = "1",required = false) int page){
        return gs.findCurrentData(page);
    }

    @RequestMapping("/goodsById")
    public Goods findById(int id) {
        return gs.findById(id);
    }
}
