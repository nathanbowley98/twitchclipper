import java.util.ArrayList;
import java.util.Timer;

public class Video {

    private double startTime;
    private double endTime;
    private double duration;

    private ArrayList<Sequence> clips = new ArrayList<>(10);


    public Video() {
        setStartTime(Time.getCurrentTime());
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }


    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
