/**
 * sequence has to be in-reference to endTime that is to say the time at which the user has clipped the recording.
 */
public class Sequence implements Time {

    private long startTime;
    private long endTime;
    private Video video;

    public Sequence(long endTime, Video video) {
        this.video = video;
        this.startTime = 0;
        setEndTime(getCurrentTime());

    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
        video.setEndTime(endTime);

    }

    @Override
    public long getCurrentTime() {
        return System.currentTimeMillis();
    }
}
