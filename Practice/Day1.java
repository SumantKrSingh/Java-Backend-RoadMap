import java.util.*;
//public class Day1 {
//
//    public static void main(String[] args) {
//        String name = "Sumant Kumar Singh ";
//        int age = 22;
//        System.out.print("My name is " + name + "and I am " + age + " years old");
//    }
//}
//
//public class Day1 {
//
//    public static void main(String[] args) {
//        for(int i = 1; i <= 20; i++){
//            if(i % 2 == 0){
//                System.out.println(i + " is even number");
//            }else{
//                System.out.println(i + " is odd number");
//            }
//        }
//    }
//}

//public class Day1{
//    static void main(String[] args) {
//        int fact = 1;
//        for(int i = 2; i <=5; i++ ){
//            fact *= i;
//        }
//        System.out.println(fact);
//    }
//}

//public class Day1{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter any no. ");
//        int table = sc.nextInt();
//
//        for(int i = 1; i <= 10; i++){
//            System.out.println(table +" X " + i + " = " + table * i);
//        }
//        sc.close();
//    }
//}
//

//public class Day1 {
//    public static void main(String[] args) {
//        int arra[] = {-3,-6,-13,-6,-8};
//        int max = Integer.MIN_VALUE;
//
//        for(int i = 0; i < arra.length; i++){
//            if (arra[i] > max) {
//                max = arra[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//public class Day1 {
//
//    static void main(String[] args) {
//        String name = "Sumant";
//        String name1 = new String("Sumant");
//
//        System.out.println(name == name1);
//        System.out.println(name.equals(name1));
//    }
//}

public class Day1 {

    static int evenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd number");
        }
        return num;
    }

    static String revString(String str) {
        str = str.toLowerCase();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        rev = rev.substring(0,1).toUpperCase() + rev.substring(1);
        return rev;
    }

    static boolean isPalindrome(String s){
       s = s.toLowerCase();
        String rev = "";
        for(int i = s.length()-1; i >=0 ; i--){
            rev += s.charAt(i);
        }
        return rev.equals(s);
    }
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
static  int maxNum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
}

    static int countVowels(String str){
        int count = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i'){
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your number :");
        int num = sc.nextInt();
//        evenOdd(num);
        System.out.println(isPrime(num));
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your string : ");
//        String str = sc.nextLine();
//        System.out.println(revString(str));
//        System.out.println(isPalindrome(str));
//        int[] num = {-5,8,12,88,1};
//        System.out.println(maxNum(num));
    }
}