package String;

import java.util.ArrayList;
import java.util.List;

public class CombinationOfPhoneNum {

    public static void letterCombinations(String digits) {
        List <String> str=new ArrayList<>();

        for(int i=0;i<digits.length();i++){
            char digit=digits.charAt(i);
            System.out.println(digit);
            switch (digit){
                case 2:
                    str.add("abc");
                    break;
                case 3:
                    str.add("def");
                    break;
                case 4:
                    str.add("ghi");
                    break;
                case 5:
                    str.add("jkl");
                    break;
                case 6:
                    str.add("mno");
                    break;
                case 7:
                    str.add("pqrs");
                    break;
                case 8:
                    str.add("tuv");
                    break;
                case 9:
                    str.add("wxyz");
                    break;
                default:
                    str.add("");
            }
        }

        System.out.println(str);
    }

    public static void main(String[] args) {
        String digits="23";
        letterCombinations(digits);
    }

}
