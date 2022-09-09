import java.time.LocalDate;

public class Comment {

    private String text;
    private LocalDate commentDate;
    private User author;

    public Comment(String text, LocalDate commentDate, User author) {
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

    public LocalDate getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(LocalDate commentDate) {
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
