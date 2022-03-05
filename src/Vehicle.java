import java.util.Arrays;
import java.util.Scanner;

public class Vehicle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = i * 7;
        }
        System.out.println(Arrays.toString(arr));

        Numbers(count);
        resultOf(arr);
    }

    public static void Numbers(int a){
        for(int i=0; i<=a; i++){
            int num = i*5+2;
            if(num%4 == 0){
                continue;
            }
            else{
                System.out.println(num);
            }
        }
    }

    public static void resultOf(int[]a){
        int len = a.length;
        for(int i=0; i<len; i++){
            if(a[i] > 21){
                break;
            }
            else{
                System.out.println(a[i]);
            }
        }
    }
}
