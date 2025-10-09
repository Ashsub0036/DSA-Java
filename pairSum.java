 
import java.util.Scanner;

public class ja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        pairSum(arr, n,k);
    }
    public static void pairSum(int[] arr, int n, int k){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] +arr[j] ==k){
                    System.out.println("Pair sum found:" + arr[i] + "+" + arr[j] + "="+ k);
                    return;
                }
            }
        }
        System.out.print("Pair sum not found");
    }
}    