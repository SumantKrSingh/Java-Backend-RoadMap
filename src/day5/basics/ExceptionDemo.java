package day5.basics;

public class ExceptionDemo {


        public static void divide(int a, int b){
            try{
                System.out.println(a / b);
            }catch(ArithmeticException e){
                System.out.println( e.getMessage());
            }finally {
                System.out.println("Final run and code completed");
            }
        }

        public static int parseNumber(String text){
            try {
                return Integer.parseInt(text);
            }catch(NumberFormatException e){
                System.out.println(e.getMessage());
                return -1;
            }

        }

        public static void readArray(int[] arr, int index){
            try{
                System.out.println(arr[index]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
    }

