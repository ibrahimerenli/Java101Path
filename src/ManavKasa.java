import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0, sum = 0.0;
        try(var input = new Scanner(System.in)){
            System.out.print("Armut Kaç Kilo ? : ");
            sum += armut * input.nextDouble();
            System.out.print("Elma Kaç Kilo ? : ");
             sum += elma * input.nextDouble();
            System.out.print("Domates Kaç Kilo ? : ");
             sum += domates * input.nextDouble();   
            System.out.print("Muz Kaç Kilo ? : ");
            sum += muz * input.nextDouble();
            System.out.print("Patlıcan Kaç Kilo ? : ");
            sum += patlican * input.nextDouble();
        }
        System.out.println("Toplam Tutar: "+ sum +"TL");
    }
}
