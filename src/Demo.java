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
        double previousTime = Time.getCurrentTime();

        //how many frames are actually going to be run before it waits
        double steps = 0;

        //terrible idea need to use something like jframe so it doesn't take up tons of cpu
        while(true) {
            //System.out.println("elapsed time in seconds: " + video.getElapsedTime());

            double currentTime = Time.getCurrentTime();
            double elapsedTime = currentTime - previousTime;
            //System.out.println("elapsed time in seconds from previous: " + elapsedTime);
            previousTime = Time.getCurrentTime();

            //increment steps
            steps += elapsedTime;

            //handle input


            //check if steps more than our sec per updaterr
            if (currentTime >= secondsPerUpdate) {
                //update game state

                System.out.printf("elapsed time in seconds: \u001B[31m %.2f \u001B[0m \nr", video.getElapsedTime());
                System.out.printf("elapsed time in seconds from previous: \u001B[31m %.5f \u001B[0m \033[A\r", elapsedTime);


                //lower steps based on secs per update
                steps -= secondsPerUpdate;
            }

            //render - prob not needed changing things with video object / sequence object

            //sync based on loop start time.
            sync(currentTime);

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

    private static void sync(double loopStartTime) {
        float loopSlot = 1f / 50;
        double endTime = loopStartTime + loopSlot;
        while(Time.getCurrentTime() < endTime) {
            try {

                //this is causing busy waiting might need to fix in the future.
                Thread.sleep(1);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
