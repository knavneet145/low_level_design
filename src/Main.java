import com.lld.LRU_Cache.LRUCacheServiceDemo;
import com.lld.LoggingFramework.LoggingFrameworkDemo;
import com.lld.MovieTicketBookingSystem.MovieTicketBookingServiceDemo;
import com.lld.MusicStreamingService.MusicStreamingServiceDemo;
import com.lld.OnlineAuctionSystem.OnlineAuctionSystemDemo;
import com.lld.OnlineShoppingService.ECommerceDemo;
import com.lld.ParkingLot.ParkingLotDemo;
import com.lld.PubSubSystem.PubSubSystemDemo;
import com.lld.RestaurentManagementSystem.RestaurentManagementDemo;
import com.lld.RideSharing.RideSharingDemo;
import com.lld.SnakeAndLadder.SnakeAndLadderDemo;
import com.lld.SocialMedia.Controller.SocialMediaDemo;
import com.lld.Splitwise.SplitwiseDemo;
import com.lld.StackOverflow.StackOverflowDemo;
import com.lld.StockBrokerageSystem.StockBrokerageDemo;
import com.lld.TaskManagement.TaskManagementDemo;

public class Main {
    public static void main(String[] args) {
        TaskManagementDemo taskManagementDemo = new TaskManagementDemo();
        StackOverflowDemo stackOverflowDemo = new StackOverflowDemo();
        SplitwiseDemo splitwiseDemo = new SplitwiseDemo();
        SocialMediaDemo socialMediaDemo = new SocialMediaDemo();
        SnakeAndLadderDemo snakeAndLadderDemo = new SnakeAndLadderDemo();
        RideSharingDemo rideSharingDemo  = new RideSharingDemo();
        RestaurentManagementDemo restaurentManagementDemo = new RestaurentManagementDemo();
        PubSubSystemDemo pubSubSystemDemo = new PubSubSystemDemo();
        ParkingLotDemo parkingLotDemo = new ParkingLotDemo();
        StockBrokerageDemo stockBrokerageDemo = new StockBrokerageDemo();
        ECommerceDemo eCommerceDemo = new ECommerceDemo();
        OnlineAuctionSystemDemo onlineAuctionSystemDemo = new OnlineAuctionSystemDemo();
        MusicStreamingServiceDemo musicStreamingServiceDemo = new MusicStreamingServiceDemo();
        MovieTicketBookingServiceDemo movieTicketBookingServiceDemo = new MovieTicketBookingServiceDemo();
        LRUCacheServiceDemo lruCacheServiceDemo = new LRUCacheServiceDemo();
        LoggingFrameworkDemo loggingFrameworkDemo = new LoggingFrameworkDemo();

        Thread thread = new Thread(loggingFrameworkDemo);
        thread.start();
    }
}
