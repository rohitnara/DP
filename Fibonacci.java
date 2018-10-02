import java.util.Scanner;

//Java program for Fibonacci Series using loop in time complexity O(n) and space complexity O(1)
class fibonacci
{
    static int fib(int n) {
        int fibNum2 = 0;
        int fibNum1 = 1;
        int fibSum = 0;
        for(int i = 2; i <= n; i++) {
            fibSum = fibNum1 + fibNum2;
            fibNum2 = fibNum1;
            fibNum1 = fibSum;
        }
        return fibSum;
    }
  
    public static void main (String args[]) 
    { 
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n)); 
    } 
}
