import java.util.Scanner;

public class Ques5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // Complete this line

            System.out.printf("%-15s%03d%n", s1, x);

            // s-> for String
            // d-> integer
            // -15-> because we have to left align the character


        }
        System.out.println("================================");

    }
}
    

