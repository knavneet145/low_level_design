import com.lld.SnakeAndLadder.SnakeAndLadderDemo;
import com.lld.SocialMedia.Controller.SocialMediaDemo;
import com.lld.SocialMedia.Service.SocialMediaService;
import com.lld.Splitwise.SplitwiseDemo;
import com.lld.StackOverflow.StackOverflowDemo;
import com.lld.TaskManagement.TaskManagementDemo;

public class Main {
    public static void main(String[] args) {
        TaskManagementDemo taskManagementDemo = new TaskManagementDemo();
        StackOverflowDemo stackOverflowDemo = new StackOverflowDemo();
        SplitwiseDemo splitwiseDemo = new SplitwiseDemo();
        SocialMediaDemo socialMediaDemo = new SocialMediaDemo();
        SnakeAndLadderDemo snakeAndLadderDemo = new SnakeAndLadderDemo();

        Thread thread = new Thread(snakeAndLadderDemo);
        thread.start();
    }
}
