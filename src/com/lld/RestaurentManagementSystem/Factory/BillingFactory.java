package com.lld.RestaurentManagementSystem.Factory;

import com.lld.RestaurentManagementSystem.Billing;

public class BillingFactory {
    public static Billing generateBilling() {
        return new Billing();
    }
}
