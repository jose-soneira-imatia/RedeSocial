import java.time.LocalDate;
import java.util.Date;

public class VideoPost extends Post {

    private String quality;
    private int duration;

    public VideoPost(String text, LocalDate postDate) {
        super(text, postDate);
    }

    public VideoPost(String text, LocalDate postDate, String quality, int duration) {
        super(text, postDate);
        this.quality = quality;
        this.duration = duration;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    @Override
    public String toString() {
        return "VideoPost{" +
                "quality='" + quality + '\'' +
                ", duration=" + duration +
                "} " + super.toString();
    }
}
