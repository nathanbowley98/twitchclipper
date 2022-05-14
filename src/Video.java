import java.util.ArrayList;
import java.util.Timer;

public class Video implements Time {

    private long startTime;
    private long endTime;
    private long duration;

    private ArrayList<Sequence> clips = new ArrayList<>(10);


    public Video() {
        setStartTime(getCurrentTime());
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    @Override
    public long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
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
