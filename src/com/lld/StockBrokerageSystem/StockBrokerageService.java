package com.lld.StockBrokerageSystem;

import com.lld.StockBrokerageSystem.OrderManagement.OrderManagement;
import javafx.util.Pair;

public class StockBrokerageService {
    public void getPortfolio(String dmatAcId) {
        PortfolioService.printPortfolio(dmatAcId);
    }

    public void processOrder(Order order) {
        OrderManagement.processOrder(order);
    }

    public void marketData() {
        LiveFeedService.getAllAvailableStocks();
    }

    public void addStocks(Pair<Stock, Integer> stock) {
        DAO.addStock(stock);
    }

    public void addTradingAcount(TradingAcount acount) {
        DAO.addTradingAcount(acount);
    }

    public void rechargeWallet(String dmatAcId, double amount) {
        TradingAcount acount = DAO.getTradingAcount(dmatAcId);
        acount.setBalance(acount.getBalance() + amount);
    }

    public void printHistory(String dmatAcNo) {
        TradingAcount acount = DAO.getTradingAcount(dmatAcNo);
        acount.printHistory();
    }
}
