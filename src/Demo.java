import java.awt.*;
import java.awt.event.KeyEvent;

public class Demo {
    public static void main(String[] args) {

        Robot robot = null;

        try {
           robot = new Robot();
        }
        catch (AWTException e) {
            e.printStackTrace();
        }


        //starting broadcast via shortcut
        robot.keyPress(KeyEvent.VK_R);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_TAB);

        //make video object
        Video video = new Video();
        System.out.println(video);

        //release buttons so that other buttons can be pressed if needed.
        robot.keyRelease(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_TAB);


        //terrible idea need to use something like jframe so it doesn't take up tons of cpu
        while(true) {
            System.out.println("test");
        }

//        //end video and livestream
//        robot.keyPress(KeyEvent.VK_E);
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_TAB);
//
//        //video.setEndTime();
//
//        //release buttons so that other buttons can be pressed if needed.
//        robot.keyRelease(KeyEvent.VK_R);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.keyRelease(KeyEvent.VK_TAB);


    }
}
