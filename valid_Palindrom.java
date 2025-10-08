 
          import java.util.*;
class validPalindrom
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();//a man ,nama
        s= s.toLowerCase().replaceAll("[^a-z0-9]","");//amannama
        int left = 0;
        int right = s.length()-1;
        boolean found = false;
        while(left < right)
        {
            if(s.charAt(left)!= s.charAt(right))
            {
                System.out.println("Not valid palindrom");
                found = true;
                break;
            }
            left++;
            right--;
        }
        System.out.println("valid palindrom");

    }
}
      