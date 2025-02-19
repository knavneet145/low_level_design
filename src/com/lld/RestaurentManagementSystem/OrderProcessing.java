package com.lld.RestaurentManagementSystem;

public class OrderProcessing {
    private OrderPreparation orderPreparation;
    private Billing billing;
    private Payment payment;
    private InventoryManager inventoryManager = InventoryManager.getInstance();

    public OrderProcessing() {
    }

    private boolean isProcessable(Order order) {
        for (Item item: order.getItems()) {
            if (inventoryManager.getMenuItemQuantity(item) < 1) {
                return false;
            }
        }
        return true;
    }

    private void takeItemsFromInventory(Order order) {
        for (Item item: order.getItems()) {
            inventoryManager.takeMenuItems(item, 1);
        }
    }

    public void processOrder(Order order) {
        if (!isProcessable(order)) {
            System.out.println("Order can not be processed..");
            return;
        }

        takeItemsFromInventory(order);
        orderPreparation.prepareOrder(order);
        billing.generateBill(order);
        payment.pay(order.getCostOfOrder());
    }

    public void setOrderPreparation(OrderPreparation orderPreparation) {
        this.orderPreparation = orderPreparation;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
