import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        int n;
        var input = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz: ");
        n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println(i + ".Elemanı giriniz: ");
            arr[i] = input.nextInt();
            
        }
        input.close();

        sort(arr);
        
        for (int eleman : arr) {
            System.out.print(eleman + " ");
        }
    }
    static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
