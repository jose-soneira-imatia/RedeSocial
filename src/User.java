
import java.util.List;

public class User {
    private String name;
    private List<Post> postList;
    private List<User> friendList;


    public User() {
    }

    public User(String name, List<Post> postList, List<User> friendList) {
        this.name = name;
        this.postList = postList;
        this.friendList = friendList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    public List<User> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<User> friendList) {
        this.friendList = friendList;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", postList=" + postList +
                ", friendList=" + friendList +
                '}';
    }
}