package Recursion;

public class oddSum {
    private static int oddSum (int n){
        if (n>1){
            return n+ oddSum(n-2);
        }
        return 1;
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(oddSum(n));
    }
}
