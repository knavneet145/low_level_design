package com.lld.OnlineShoppingService;

import com.lld.OnlineShoppingService.Factory.ProductFactory;

public class ECommerceDemo implements Runnable {

    @Override
    public void run() {
        ECommerceService eCommerceService = new ECommerceService();
        Product chai1 = ProductFactory.getInstance("chai", ProductCategory.FMCG, 150.0);
        Product chai2 = ProductFactory.getInstance("chai", ProductCategory.FMCG, 150.0);
        Product cricketBat1 = ProductFactory.getInstance("Bat", ProductCategory.SPORTS, 1987.0);

        Profile navneet = eCommerceService.createUser("navneet");
        eCommerceService.addItemToCart(chai1, 1, navneet);
        eCommerceService.addItemToCart(cricketBat1, 1, navneet);

        eCommerceService.placeOrder(navneet);
    }
}
