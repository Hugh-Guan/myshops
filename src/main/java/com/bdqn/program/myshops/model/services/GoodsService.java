package com.bdqn.program.myshops.model.services;

import com.bdqn.program.myshops.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GoodsService {
    @Autowired
    private com.bdqn.program.myshops.dao.GoodsDao gDao;

    public Map findCurrentData(int page) {
        Map map = new HashMap();
        map.put("datas",gDao.findCurrentData(page));
        map.put("size",gDao.getCountPage());
        return map;
    }

    public Goods findById(int id) {
        return gDao.findById(id);
    }
}
