import java.util.Random;

public class Main {
    public static int generateID() {
        Random random = new Random();
        return random.nextInt(Integer.MAX_VALUE + 1);
    }

    public static void main(String[] args) {
    }
}
