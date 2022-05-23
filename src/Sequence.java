/**
 * sequence has to be in-reference to endTime that is to say the time at which the user has clipped the recording.
 */
public class Sequence {

    private double startTime;
    private double endTime;
    private Video video;

    public Sequence(double endTime, Video video) {
        this.video = video;
        this.startTime = 0;
        setEndTime(Time.getCurrentTime());

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
        video.setEndTime(endTime);

    }


    /*public long getCurrentTime() {
        return System.currentTimeMillis();
    }*/
}
