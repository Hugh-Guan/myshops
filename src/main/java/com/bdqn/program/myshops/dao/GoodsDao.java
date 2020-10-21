package com.bdqn.program.myshops.dao;

import com.bdqn.program.myshops.entity.Goods;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsDao {

    @Select("select * from goods limit ${(page-1)*20},20")
    public List<Goods> findCurrentData(int page);

    @Select("select ceil(count(*)/20) cp from goods")
    public int getCountPage();

    @Select("select * from goods where good_id=#{id}")
    public Goods findById(int id);

}
