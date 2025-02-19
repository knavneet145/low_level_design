package com.lld.RestaurentManagementSystem;

import com.lld.RestaurentManagementSystem.Builder.OrderProcessingBuilder;
import com.lld.RestaurentManagementSystem.Constants.Constant;
import com.lld.RestaurentManagementSystem.Factory.BillingFactory;
import com.lld.RestaurentManagementSystem.Factory.OrderPreparationFactory;
import com.lld.RestaurentManagementSystem.Factory.PaymentFactory;

public class RestaurentManagementService {
    private OrderProcessing orderProcessing;
    private final Menu menu;
    private final ReservationManager reservationManager;
    private final SalesReportAndInventoryAnalysis salesReportAndInventoryAnalysis;
    private static RestaurentManagementService instance;

    public static RestaurentManagementService getInstance() {
        if (instance == null) {
            instance = new RestaurentManagementService();
        }

        return instance;
    }

    private RestaurentManagementService() {
        OrderProcessingBuilder builder = new OrderProcessingBuilder();
        OrderPreparation orderPreparation = OrderPreparationFactory.generateOrderPreparation();
        Billing billing = BillingFactory.generateBilling();
        Payment payment = PaymentFactory.generatePayment("cash");
        this.orderProcessing = builder.setBilling(billing);
        this.orderProcessing = builder.setPayment(payment);
        this.orderProcessing = builder.setOrderPreparation(orderPreparation);
        this.menu = Menu.getInstance();
        this.reservationManager = ReservationManager.getInstance(Constant.Total_Seats);
        InventoryManager inventoryManager = InventoryManager.getInstance();
        salesReportAndInventoryAnalysis = new SalesReportAndInventoryAnalysis(inventoryManager);
        menu.populateMenu();
    }

    public void placeOrder(Order order)  {
        orderProcessing.processOrder(order);
    }

    public void viewMenu() {
        menu.showMenu();
    }

    public void makeReservation(String userId, int numberOfMembers) {
        reservationManager.reserveSeats(userId, numberOfMembers);
    }

    public void leaving(String userId) {
        reservationManager.leaveUser(userId);
    }

    public void getSalesReport() {
        salesReportAndInventoryAnalysis.generateSalesReport();
    }

    public void getInventoryAnalysis() {
        salesReportAndInventoryAnalysis.getInventoryAnalysisReport();
    }

    public void addStaffMember(StaffMember staffMember) {
        StaffManager.addStaffMember(staffMember);
    }

    public void deleteStaffMember(StaffMember staffMember) {
        StaffManager.deleteStaffMember(staffMember);
    }
}
