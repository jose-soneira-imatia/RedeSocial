import java.util.Date;
import java.util.List;

public class ImagePost extends Post{

    private String dimension;


    public ImagePost(String text, Date postDate) {
        super(text, postDate);
    }

    public ImagePost(String text, Date postDate, String dimension) {
        super(text, postDate);
        this.dimension = dimension;
    }

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
                '}';
    }
}
