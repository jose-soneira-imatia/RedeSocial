import java.util.Date;

public class Comment {

    private String text;
    private Date commentDate;
    private User author;

    public Comment(String text, Date commentDate, User author) {
        this.text = text;
        this.commentDate = commentDate;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "text='" + text + '\'' +
                ", commentDate=" + commentDate +
                ", author=" + author +
                '}';
    }
}
