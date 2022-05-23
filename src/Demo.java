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


        double secondsPerUpdate = 1.0 / 30.0;


        //terrible idea need to use something like jframe so it doesn't take up tons of cpu
        while(true) {
            System.out.println("current time in seconds: " + getCurrentTime());
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

    public static double getCurrentTime() {

        double tenPowerNine = 1_000_000_000;

        return System.nanoTime() / tenPowerNine;
    }
}
