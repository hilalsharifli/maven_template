package app;

import java.io.InputStream;
import java.util.Scanner;

public class DataInput {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);
        double a;
        double b;
        String s;
        System.out.println("Please input first number:");
        a=scanner.nextInt();
        System.out.println("Please input second number:");
        b=scanner.nextInt();
        System.out.println("Please input import operation sign:");
        s=scanner.next();
            if (s.equals("+")) {
            System.out.println("a+b is equal to " + (a + b));
        }
            if (s.equals("-")){
                System.out.println("a-b is equal to " + (a-b));
            }
        if (s.equals("*")) {
            System.out.println("a*b is equal to " + (a*b));
        }
        if (s.equals("/")){
            System.out.println("a/b is equal to " + (a/b));
        }

    }

}
