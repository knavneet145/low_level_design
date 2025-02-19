package com.lld.RestaurentManagementSystem;

import com.sun.tools.corba.se.idl.constExpr.Or;

public class OrderPreparation {
    public void prepareOrder(Order order) {
        System.out.println("Preparaing order "+order.getId());
    }
}
