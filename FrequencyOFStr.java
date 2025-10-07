import java.util.*;
class Main{
    public static void main(String args[]){
        String s ="AshwiniSubramani";
        String ss =s.toLowerCase();
        HashMap <Character, Integer> map = new HashMap<>();
         char[] st = ss.toCharArray();
        for(char str : st){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        System.out.print(map);
    }
}