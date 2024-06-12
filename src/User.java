import java.util.ArrayList;

public class User {
    static ArrayList<User> users = new ArrayList<>();
    String firstName;
    String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        addUser(this);
    }

    public static void addUser(User user) {
        users.add(user);
    }

    public static void removeUser(User user) {
        users.remove(user);
    }
}
