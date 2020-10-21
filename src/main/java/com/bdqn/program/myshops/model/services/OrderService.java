package com.bdqn.program.myshops.model.services;

import com.bdqn.program.myshops.entity.OrderItems;
import com.bdqn.program.myshops.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private com.bdqn.program.myshops.dao.OrderDao oDao;

    public void saveOrder(Orders order, List<OrderItems> ois){
        oDao.saveOrder(order);
        for (OrderItems oi:ois){
            oi.setOrd_id(order.getOrd_id());
        }
        oDao.saveOrderItems(ois);
    }
}
