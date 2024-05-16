package easy;
//https://leetcode.com/problems/palindrome-number/
public class palindromeNumber {
    public static void main(String[] args) {
        palindromeNumber obj = new palindromeNumber();
        System.out.println(obj.isPalindrome(121));
        System.out.println(obj.isPalindrome(-121));
        System.out.println(obj.isPalindrome(10));
    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long reversed = 0;
        long temp = x;
        while (temp != 0){
            int digit = (int) (temp%10);
            reversed = reversed * 10 + digit;
            temp = temp/10;
        }
        return (reversed == x);
    }
}
