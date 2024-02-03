package String;

import java.util.Stack;

public class LongestParenthesis {

    public static int longestValidParentheses(String str) {
        Stack<Character> stk=new Stack<>();
        int count=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                stk.push(str.charAt(i));
            }else{
                if(!stk.isEmpty()){
                    stk.pop();
                    count=count+2;
                }
            }

        }
        return count;
    }
    public static void main(String[] args) {
        String str="(())((";
        System.out.println(longestValidParentheses(str));
    }
}
