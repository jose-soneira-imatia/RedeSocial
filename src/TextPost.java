import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class TextPost extends Post {

    private String content;

    public TextPost(String text, LocalDate postDate) {
        super(text, postDate);
    }

    public TextPost(String text, LocalDate postDate, String content) {
        super(text, postDate);
        this.content=content;
    }

    public TextPost(String text, LocalDate of, ArrayList<Comment> comments, String content) {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TextPost{" +
                "content='" + content + '\'' +
                '}';
    }
}
