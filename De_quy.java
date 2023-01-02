package Recursion;

import java.util.Scanner;

public class De_quy {
    // Bai toan de quy tinh luy thua
    // 2 usages = Recursion
    public static double Luy_thua (int n, double a){
        if (n==1){
            return a;
        }
        return a* Luy_thua(n-1,a);

    }

    // Cho mot mang A   3 5 7 9 6 5
    // Tinh sum = de quy
    public static double linearSum (int n, int arr[]){  // 5, 4, 3, 2, 1
         if(n==1){                               // index  4, 3, 2, 1, 0
             return arr[0];
         }
         return  arr[n-1] + linearSum( n-1, arr);
         // vì index = n-1 là phần tử cuối cùng của mảng
        // n giảm 1 sau mỗi lần gọi lại hàm

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*  System.out.print("Tinh luy thua bac ");
        int n = sc.nextInt ();
        System.out.print( " cua so ");
        double a = sc.nextDouble ();*/
        //System.out.println(a+" pow "+n + "= " + Luy_thua(n,a));


        System.out.println("Moi ban nhap so phan tu cua mang ");

        // Giải thuật với mảng
        // Khai báo số phần tử trong mảng
        int n = sc.nextInt();

        // Khai báo mảng và cấp phát bộ nhớ
        int arr[] = new int [n];

        // Nhập input cho các phần tử trong mảng
        for(int i=0; i<n; i++){
            System.out.print(" arr["+i+"] = " );
            arr[i] = sc.nextInt ();
        }

        System.out.println(linearSum(n,arr));
    }
}
