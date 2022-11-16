import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args) {
        int number, exp;
        try(var input = new Scanner(System.in)){
            System.out.println("Sayıyı Girin: ");
            number = input.nextInt();
            System.out.println("Üssü Girin: ");
            exp = input.nextInt();
        }
        System.out.println("Sonuç: "+ Power(number, exp));
    }
    public static int Power(int base, int exp){
        if(exp <= 0)
            return 1;
        return base * Power(base, exp - 1);
    }
}
