import java.util.*;
class twoSum 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc .nextInt();
        int[] arr =  new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        int left= 0;
        int right = n-1;
        boolean found = false;
        while(left < right)
        {
          int sum = arr[left] + arr[right];
           if(sum == target)
           {
            System.out.println("True");
            found = true;
            break;
           }
           else if(sum < target)
           {
            left++;
           }
           else
           {
             right--;
           }
        } 
        if(!found){
        System.out.println("False");
        }
    }
}         