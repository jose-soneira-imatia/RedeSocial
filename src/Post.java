import java.util.Date;
import java.util.List;

public class Post {
    private String text;
    private Date postDate;
    private List<Comment> commentList;

    public Post(String text, Date postDate) {
        this.text = text;
        this.postDate = postDate;
    }

    public Post(String text, Date postDate, List<Comment> commentList) {
        this.text = text;
        this.postDate = postDate;
        this.commentList = commentList;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
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
