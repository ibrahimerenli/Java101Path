import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        try(var input = new Scanner(System.in)){
            System.out.println("Eleman Sayısı: ");
            n = input.nextInt();
        }
        
        for(int i = 0; i < n; i++)
            System.out.print(Fib(i) + " ");
      
    }
    public static int Fib(int n){
        if(n <= 1)
            return n;
        else 
            return Fib(n -  1) + Fib(n - 2);
    }
}
