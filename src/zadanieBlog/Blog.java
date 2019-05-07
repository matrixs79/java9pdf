package zadanieBlog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blog {
    private List<User> users;
    private List<Post> posts;

    public Blog() {
        users = new ArrayList<>();
        posts = new ArrayList<>();
    }

    public void publishPost(int userId, String content) {
        User user = findUser(userId);
        if(user == null) {
            System.out.println("Cannot publish post, user ID: " + userId + " doesn't exist.");
        } else {
            System.out.println(user.getNickName() + " posted just now: " + content);
            posts.add(new Post(new Date(), user, content));
        }
    }

    public void commentPost(int userId, int postId, String content) {
        User user = findUser(userId);
        if(user == null) {
            System.out.println("Cannot publish comment, user ID: " + userId + " doesn't exist.");
            return;
        }

        Post post = findPost(postId);
        if(post == null) {
            System.out.println("Cannot comment post, post ID: " + postId + " doesn't exist.");
            return;
        }

        System.out.println(user.getNickName()
                + " commented "
                + post.getAuthor().getNickName()
                + ": "
                + content);

        post.getComments().add(new Comment(new Date(), user, content));
    }

    public void displayUserEntries(int userId) {
        User user = findUser(userId);

        if(user == null) {
            System.out.println("Cannot display entries, user ID: " + userId + " doesn't exist.");
            return;
        }

        System.out.println(user.getNickName() + "'s entries: ");
        for (Post p: posts) {
            if(p.getAuthor().getId() == userId) {
                System.out.println("(POST) " + p.getContent());
            }
            for (Comment c : p.getComments()) {
                if (c.getAuthor().getId() == userId) {
                    System.out.println("(COMMENT) " + c.getContent());
                }
            }
        }

    }

    private User findUser(int userId) {
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getId() == userId) {
                return users.get(i);
            }
        }
        return null;
    }

    private Post findPost(int postId) {
        for (int i = 0; i < posts.size(); i++) {
            if(posts.get(i).getId() == postId) {
                return posts.get(i);
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return users;
    }


    public List<Post> getPosts() {
        return posts;
    }

}
