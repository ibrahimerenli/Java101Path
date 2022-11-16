import java.util.Arrays;

public class ModeArray {
    public static void main(String[] args) {
        int [] list = {3, 7, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10};

        Arrays.sort(list);
        for(int i = 0; i < list.length; i++){
            if(list[i] % 2 == 0 && list[i] == list[i - 1])
                System.out.println(list[i]);
        }
    }
}
