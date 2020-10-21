package com.bdqn.program.myshops.dao;


import com.bdqn.program.myshops.entity.OrderItems;
import com.bdqn.program.myshops.entity.Orders;

import java.util.List;

public interface OrderDao {
    public void saveOrder(Orders order);
    public void saveOrderItems(List<OrderItems> ois);
}
