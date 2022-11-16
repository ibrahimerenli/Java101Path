import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        try(var input = new Scanner(System.in)){
            System.out.println("Yıl Giriniz : ");
            year = input.nextInt();
        }

        if(year%4 == 0){
            if(year%100 == 0)
                System.out.println(year%400 == 0 ? year +" bir artık yıldır !" : year + " bir artık yıl değildir !");
            else
                System.out.println(year +" bir artık yıldır !");
        }
        else
            System.out.println(year + " bir artık yıl değildir !");

    }
}
