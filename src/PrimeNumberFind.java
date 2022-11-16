import java.util.Scanner;

public class PrimeNumberFind {
    public static void main(String[] args) {
        int number;
        try(var input = new Scanner(System.in)){
            System.out.println("Sayı Giriniz: ");
            number = input.nextInt();
        }
        System.out.println(isPrime(number, 2) ? number+" ASALDIR !" : number+" ASAl değildir.");
    }
    static boolean isPrime(int n, int i)
    {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrime(n, i + 1);
    }

}
