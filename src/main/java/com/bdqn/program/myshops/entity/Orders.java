package com.bdqn.program.myshops.entity;

import java.util.Date;

public class Orders {
    private int ord_id;
    private String order_num;
    private int cust_id;
    private int ord_status;
    private Date created_at;
    private String pay_type;
    private String need_desc;
    private String bank;

    public int getOrd_id() {
        return ord_id;
    }

    public void setOrd_id(int ord_id) {
        this.ord_id = ord_id;
    }

    public String getOrder_num() {
        return order_num;
    }

    public void setOrder_num(String order_num) {
        this.order_num = order_num;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public int getOrd_status() {
        return ord_status;
    }

    public void setOrd_status(int ord_status) {
        this.ord_status = ord_status;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getPay_type() {
        return pay_type;
    }

    public void setPay_type(String pay_type) {
        this.pay_type = pay_type;
    }

    public String getNeed_desc() {
        return need_desc;
    }

    public void setNeed_desc(String need_desc) {
        this.need_desc = need_desc;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
}
