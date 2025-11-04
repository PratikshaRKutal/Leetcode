package solutions;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int ans=0;
        for(int i=0;i<s.length();i++){
            int value=map.get(s.charAt(i));
            if(i+1<s.length() && map.get(s.charAt(i+1))>value){
                ans -= value;
            }
            else{
                ans += value;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="III";

        System.out.println(romanToInt(s));
    }
}
