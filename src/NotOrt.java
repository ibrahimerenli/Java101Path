import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {
        int math, physics, chemistry, turkish, history, music;
        double avg;
        try (var input = new Scanner(System.in)) {
            System.out.print("Please enter your math grade:  ");
            math = input.nextInt();

            System.out.print("Please enter your chemistry grade: ");
            chemistry = input.nextInt();

            System.out.print("Please enter your physics grade: ");
            physics = input.nextInt();

            System.out.print("Please enter your Turkish grade: ");
            turkish = input.nextInt();

            System.out.print("Please enter your history grade: ");
            history = input.nextInt();

            System.out.print("Please enter your music grade: ");
            music = input.nextInt();
        }

        avg = (math+physics+chemistry+turkish+history+music)/6.0;
        System.out.println("Average : " + avg);

        String str = avg > 60 ? "You passed the grade!" :"You failed!";
        System.out.println(str);

    }
}