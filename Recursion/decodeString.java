//package Recursion;
//
//import java.util.Stack;
//
//public class decodeString {
//    public static  String Decode (String str){
//        Stack<Character> charStk=new Stack<>();
//        Stack<Integer> numStk=new Stack<>();
//        for(int i=0;i<str.length();i++){
//           if(str.charAt(i)!=']'){
//               if((str.charAt(i)>=97 && str.charAt(i)<=122) || str.charAt(i)=='{'){
//                  charStk.push(str.charAt(i));
//               }
//               else{
//                   int num=Character.getNumericValue(str.charAt(i));
//                   numStk.push(num);
//               }
//           }else{
//               boolean flag=true;
//               String temp="";
//               while(flag){
//                   if(charStk.pop()=='}')
//                   temp=temp.concat(charStk.pop());
//
//               }
//           }
//        }
//    }
//    public static void main(String[] args) {
//        String str="3[2a[c]]";
//        System.out.println(Decode(str));
//    }
//}
