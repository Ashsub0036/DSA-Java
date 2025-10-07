class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] st=s.toCharArray();
        for(char str :st){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(st[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}