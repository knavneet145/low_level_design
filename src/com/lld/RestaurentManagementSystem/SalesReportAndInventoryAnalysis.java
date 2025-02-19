package com.lld.RestaurentManagementSystem;

import java.util.Map;

public class SalesReportAndInventoryAnalysis {
    private InventoryManager inventoryManager;

    public SalesReportAndInventoryAnalysis(InventoryManager inventoryManager) {
        this.inventoryManager = inventoryManager;
    }

    public void generateSalesReport() {
        System.out.println("Generating sales report for items: ");
        for (Map.Entry<Item, Integer> entry: inventoryManager.getSoldItems().entrySet()) {
            System.out.println(entry.getKey().getName()+" : "+entry.getValue());
        }
    }

    public void getInventoryAnalysisReport() {
        System.out.println("Generating inventory analysis report");
        for (Map.Entry<Item, Integer> entry: inventoryManager.getMenuItems().entrySet()) {
            System.out.println(entry.getKey().getName()+" : "+entry.getValue());
        }
    }
}
