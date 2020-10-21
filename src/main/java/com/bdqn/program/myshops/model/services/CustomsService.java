package com.bdqn.program.myshops.model.services;


import com.bdqn.program.myshops.entity.Customs;
import com.bdqn.program.myshops.dao.CustomDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomsService {

    @Autowired
    private CustomDao cDao;

    public Customs login(Customs cust) {
        return cDao.login(cust);
    }
}
