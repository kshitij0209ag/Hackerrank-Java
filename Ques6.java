import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Ques6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.printf("%d x %d = %d \n", N, i, result);
        }
    }
}
