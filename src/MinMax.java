import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int n, max = 0, min = 0;
        try(var input = new Scanner(System.in)){
            System.out.println("Kaç tane sayı gireceksiniz: ");
            n = input.nextInt();
            
            for(int i = 0; i < n; i++){
                System.out.println(i + ".Sayıyı giriniz: ");
                int number = input.nextInt();
                if( max < number)
                    max = number;
                if(min > number)
                    min = number;
            }
        }
        System.out.println("En büyük sayı: "+ max);
        System.out.println("En küçük sayı: "+ min);

    }
}
