package Recursion;
import java.util.InputMismatchException;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

//        char x= str.charAt(4);
//        System.out.println(x);
        int integer = Integer.valueOf('a'); // is wrong. It will change the char value to ASCII
        int integer1 = (int) 'a';
        System.out.println(integer1);
        boolean check;
        do {
            System.out.println("Get integer:");
            if (sc.hasNextInt()){
                check = true;
            }
            else {
                check = false;
               String str = sc.next();
            }
        }while (!check);
        System.out.println(sc.nextInt());


/**
 * Integer.valueOf()  changes the value of input into corresponding ASCII value
  */
//        System.out.println(integer);
//         double x = sc.next();
//          int i = sc.nextInt();
//          String i = sc.next();
//          String str = sc.nextLine();
//        System.out.println(i+"/"+str+"1");
      }
    }
