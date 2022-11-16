import java.util.Scanner;


public class FlightTicketPrice {
    public static void main(String[] args) {
        int a, b, c;
        try (var input = new Scanner(System.in)) {

        System.out.println("Mesafeyi km türünden giriniz :");
        a = input.nextInt();
        System.out.println("Yaşınızı giriniz :");
        b = input.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) :");
        c = input.nextInt();
        }
        System.out.println("Toplam Tutar = " + TicketPrice(a, b, c));
    }
     

    public static double TicketPrice(int km, int age, int choice){
        if (km<0 || age<0 || (choice<1  && choice>2)){
            System.out.println("Hatalı veri girdiniz!");
            return 0;
        }
        double sum;
        sum = km * 0.10;

        if(age<12)
            sum -= sum * 0.5;

        else if(age>12 && age<24)
            sum -= sum * 0.1;

        else if(age>65)
            sum -= sum * 0.3;

        if(choice == 2)
            sum -= sum *0.2;
        
        return sum;
    }
}