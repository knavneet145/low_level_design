package com.lld.RestaurentManagementSystem;

import com.lld.RestaurentManagementSystem.Factory.ItemFactory;
import com.lld.RestaurentManagementSystem.Factory.OrderFactory;

import java.util.Arrays;

public class RestaurentManagementDemo implements Runnable{
    public void run() {
        RestaurentManagementService restaurentManagementService = RestaurentManagementService.getInstance();
        Order order = OrderFactory.getOrderInstance(Arrays.asList(ItemFactory.getItemInstance("dal", 90.0), ItemFactory.getItemInstance("roti", 10.0)));
        ItemFactory.getItemInstance("kadai paneer", 100.0);
        ItemFactory.getItemInstance("chai", 15.0);
        ItemFactory.getItemInstance("malai kofta", 150.0);
        ItemFactory.getItemInstance("malai kofta", 150.0);
        restaurentManagementService.viewMenu();
        restaurentManagementService.placeOrder(order);
    }
}
