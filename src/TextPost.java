import java.util.Date;

public class TextPost extends Post {

    private String content;

    public TextPost(String text, Date postDate) {
        super(text, postDate);
    }

    public TextPost(String text, Date postDate, String content) {
        super(text, postDate);
        this.content=content;
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
