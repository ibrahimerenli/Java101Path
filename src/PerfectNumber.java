import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        int number, sum=0;
        try(var input = new Scanner(System.in)){
            System.out.println("Bir sayı giriniz: ");
            number = input.nextInt();
        }
        for(int i = 1; i < number; i++){
            if(number%i == 0){
                sum += i;
            }
        }
        if(sum == number)
            System.out.println(number + " Mükemmel sayıdır.");
        else
            System.out.println(number + " Mükemmel sayı değildir.");
    }
}
