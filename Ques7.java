import java.util.*;
import java.io.*;
import java.lang.Math.*;

public class Ques7 {
    public static void main(String[] argh){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for(int j=0; j<c; j++){
                a = a + (int)(Math.pow(2,j)*b); 
                // Math.pow function used, whenever we have given the value in power just like square --> 2^2
            }

        }
        sc.close();
    }
}
