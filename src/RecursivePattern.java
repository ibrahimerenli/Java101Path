import java.util.Scanner;

public class RecursivePattern {
    public static void main(String[] args) {
        int number;
        try(var input = new Scanner(System.in)){
            System.out.println("N Sayısını Giriniz: ");
            number = input.nextInt();
        }
        patternShow(number, 0, true);
    }

    public static void patternShow(int number, int counter, boolean flag){
        if(number<=0)
            flag = false;
        System.out.print(number + " ");

        if(flag){
            patternShow(number - 5, counter + 1, flag);
        }
        else{
            if(counter == 0)
                return;
            patternShow(number + 5, counter - 1, flag);
        }          
    }
}
