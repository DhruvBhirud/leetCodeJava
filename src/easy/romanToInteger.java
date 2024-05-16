package easy;
//https://leetcode.com/problems/roman-to-integer/
public class romanToInteger {
    public static void main(String[] args){
        romanToInteger obj = new romanToInteger();
        System.out.println(obj.romanToInt("III"));
        System.out.println(obj.romanToInt("IV"));
        System.out.println(obj.romanToInt("IX"));
        System.out.println(obj.romanToInt("LVIII"));
        System.out.println(obj.romanToInt("MCMXCIV"));
    }
    public int romanToInt(String s) {
        int answer = 0, num = 0, prev = 0;
        for(int j = s.length()-1; j>=0; j--){
            switch (s.charAt(j)){
                case 'M': num=1000; break;
                case 'D': num=500; break;
                case 'C': num=100; break;
                case 'L': num=50; break;
                case 'X': num=10; break;
                case 'V': num=5; break;
                case 'I': num=1; break;
            }
            if (4*num<answer){
                answer -= num;
            }else{
                answer += num;
            }
        }
        return answer;
    }
}
