package easy;
import java.util.*;

public class longestCommonPrefix {
    public static void main(String[] args){
        longestCommonPrefix obj = new longestCommonPrefix();
        String[] strs = {"flower","flow","flight"};
        obj.longestCommonPrefix(strs);
        System.out.println(obj.longestCommonPrefix(strs));
    }
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int i = 0;
        while(i < s1.length() && i < s2.length()){
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
            } else {
                break;
            }
        }
        return s1.substring(0, i);
    }
}