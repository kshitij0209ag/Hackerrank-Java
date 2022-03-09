import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String ans;
        if (N % 2 == 0) {
            if ((N <= 2 && N <= 5) || N > 20) {
                ans = "Not Weird";
            } else {
                ans = "Weird";
            }
        } else {
            ans = "Weird";
        }
        System.out.print(ans);
    }
}


