import java.util.*;
public class scan {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int a = scanner.nextInt();
            System.out.println("Number entered is "+a);

            // buffer removal
            System.out.println("Enter a sentence which will then be displayed as split of words:");
            scanner.nextLine();
            
            String str = scanner.nextLine();
            System.out.println(str);
            System.out.println();
            String[] words = str.split(" ");
            System.out.println(Arrays.toString(words));

            for (String ret : words) {
                System.out.println(ret);
            }
        }
    }
}
