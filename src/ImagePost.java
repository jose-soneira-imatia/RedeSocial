import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ImagePost extends Post {

    private String dimension;


    public ImagePost(String text, LocalDate postDate) {
        super(text, postDate);
    }

    public ImagePost(String text, LocalDate postDate, String dimension) {
        super(text, postDate);
        this.dimension = dimension;
    }

//    public <T> ImagePost(String text, LocalDate postDate, List<T> emptyList, String dimension) {
//        super();
//    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "ImagePost{" +
                "dimension='" + dimension + '\'' +
                "} " + super.toString();
    }
}