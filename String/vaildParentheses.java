package String;

import java.util.Stack;

public class vaildParentheses {
    public static void main(String[] args) {
        String str="{[}]";
        System.out.println(vaildOrNot(str));
    }

    private static boolean vaildOrNot(String str) {
        Stack <Character> stk=new Stack<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                stk.push(str.charAt(i));
            }else{
                if(stk.isEmpty()){
                    return false;
                }

                char check;
                switch (str.charAt(i)){
                    case ')':
                        check=stk.pop();
                        if(check=='{' || check=='[') return false;
                        break;
                    case '}':
                        check=stk.pop();
                        if(check=='(' || check=='[') return false;
                        break;
                    case ']':
                        check=stk.pop();
                        if(check=='(' || check=='{') return false;
                        break;

                }

            }

        }
        return (stk.isEmpty());
    }
}
