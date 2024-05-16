package easy;

public class validParentheses {
    public static void main(String[] args){
        validParentheses obj = new validParentheses();
        System.out.println(obj.isValid("()"));
        System.out.println(obj.isValid("()[]{}"));
        System.out.println(obj.isValid("(]"));
        System.out.println(obj.isValid("([)]"));
        System.out.println(obj.isValid("{[]}"));
    }
    public boolean isValid(String s) {
        while(true){
            if(s.contains("()")){
                s = s.replace("()","");
            } else if (s.contains("[]")){
                s = s.replace("[]","");
            } else if (s.contains("{}")){
                s = s.replace("{}","");
            } else {
                return s.isEmpty();
            }
        }
    }
}
