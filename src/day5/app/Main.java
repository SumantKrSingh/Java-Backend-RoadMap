package day5.app;
import day5.basics.ExceptionDemo;

import java.util.Scanner;


public class Main {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter dividend: ");

            int a = sc.nextInt();
            System.out.println("Enter divisor: ");

            int b = sc.nextInt();

            ExceptionDemo.divide(a, b);

            sc.close();

            ExceptionDemo.parseNumber("123");
            ExceptionDemo.parseNumber("abc");
            ExceptionDemo.readArray(new int[]{1,2,3}, 5);
        }
    }
