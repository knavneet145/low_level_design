package com.lld.StockBrokerageSystem;

import com.lld.StockBrokerageSystem.Constants.OrderType;
import com.lld.StockBrokerageSystem.Factory.OrderFactory;
import com.lld.StockBrokerageSystem.Factory.StockFactory;
import com.lld.StockBrokerageSystem.Factory.TradingAcountFactory;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class StockBrokerageDemo implements Runnable{

    @Override
    public void run() {
        StockBrokerageService stockBrokerageService = new StockBrokerageService();
        TradingAcount navneet = TradingAcountFactory.getInstance("navneet");
        TradingAcount bob = TradingAcountFactory.getInstance("bob");
        stockBrokerageService.addTradingAcount(navneet);
        stockBrokerageService.addTradingAcount(bob);

        stockBrokerageService.rechargeWallet(navneet.getDmatAcId(), 1000000.0);
        stockBrokerageService.rechargeWallet(bob.getDmatAcId(), 100000.0);

        Stock dhaniLoans = StockFactory.getInstance("dhani loans", 109.89);
        Stock tata = StockFactory.getInstance("tata", 209.87);
        Stock tcs = StockFactory.getInstance("TCS", 398.90);
        stockBrokerageService.addStocks(new Pair<>(dhaniLoans, 10));
        stockBrokerageService.addStocks(new Pair<>(tcs, 90));
        stockBrokerageService.addStocks(new Pair<>(tata, 23));

        stockBrokerageService.marketData();

        List<Pair<Stock, Integer>> orders = new ArrayList<>();
        orders.add(new Pair<>(dhaniLoans, 3));
        orders.add(new Pair<>(tcs, 10));
        Order navneetOrder = OrderFactory.getInstance(navneet.getDmatAcId(),orders, OrderType.BUY);
        Order navneetOrder2 = OrderFactory.getInstance(navneet.getDmatAcId(), orders, OrderType.SELL);

        stockBrokerageService.processOrder(navneetOrder);
        stockBrokerageService.marketData();
        stockBrokerageService.getPortfolio(navneet.getDmatAcId());
        stockBrokerageService.processOrder(navneetOrder2);
        stockBrokerageService.marketData();
        stockBrokerageService.getPortfolio(navneet.getDmatAcId());
        stockBrokerageService.printHistory(navneet.getDmatAcId());
    }
}
