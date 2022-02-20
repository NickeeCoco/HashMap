import java.util.HashMap;
import java.util.Scanner;

public class HashMapExercise {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<String, String>();
        Scanner scanner = new Scanner(System.in);
        String userInput;


        while(true) {
            System.out.println("Please input your name and age");
            userInput = scanner.nextLine();

            String[] inputs = userInput.split(" ");

            users.put(inputs[0], inputs[1]);

            System.out.println(users);
        }
    }

}
