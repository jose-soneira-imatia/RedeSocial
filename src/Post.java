import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private String text;
    private LocalDate postDate;
    private List<Comment> commentList =  new ArrayList<>();

    public Post(String text, LocalDate postDate) {
        this.text = text;
        this.postDate = postDate;
    }

    public Post(String text, LocalDate postDate, List<Comment> commentList) {
        this.text = text;
        this.postDate = postDate;
        this.commentList = commentList;
    }

    public Post() {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    @Override
    public String toString() {
        return "Post{" +
                "text='" + text + '\'' +
                ", postDate=" + postDate +
                ", commentList=" + commentList +
                '}';
    }
}
