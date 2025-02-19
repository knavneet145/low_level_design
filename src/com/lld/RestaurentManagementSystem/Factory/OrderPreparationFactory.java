package com.lld.RestaurentManagementSystem.Factory;

import com.lld.RestaurentManagementSystem.OrderPreparation;

public class OrderPreparationFactory {
    public static OrderPreparation generateOrderPreparation() {
        return new OrderPreparation();
    }
}
