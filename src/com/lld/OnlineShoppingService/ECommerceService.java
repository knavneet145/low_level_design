package com.lld.OnlineShoppingService;

import com.lld.OnlineShoppingService.Factory.ProfileFactory;

public class ECommerceService {
    public Profile createUser(String userName) {
        return ProfileFactory.getInstance(userName);
    }

    public void addItemToCart(Product product, int quantity, Profile user) {
        user.getCart().addProductToCart(product, quantity);
    }

    public void removeItemsFromCart(Product product, int quantity, Profile user) {
        user.getCart().removeProduct(product, quantity);
    }

    public void showOrderHistory(Profile userProfile) {
        DisplayHistory.displayHistory(userProfile);
    }

    public void placeOrder(Profile profile) {
        profile.getCart().placeOrder();
    }

}
