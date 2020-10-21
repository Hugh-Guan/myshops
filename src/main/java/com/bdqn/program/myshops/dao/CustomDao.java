package com.bdqn.program.myshops.dao;

import com.bdqn.program.myshops.entity.Customs;
import org.apache.ibatis.annotations.Select;

public interface CustomDao {

    @Select("select * from customs where logname=#{logname} and pwd=#{pwd}")
    public Customs login(Customs cust);

}
