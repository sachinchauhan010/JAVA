package Searching;
import  java.util.*;
public class wordContain {
    public static  List<Integer> findWordsContaining(String[] words, char x) {
       List <Integer> res= new ArrayList<>();
       for(int i=0;i<words.length;i++){
           if(words[i].indexOf(x)!=-1){
               res.add(i);
           }
       }
       return res;
    }
    public static void main(String[] args) {
        String arr[]={"leet","Code"};
        char ch='e';
        System.out.println(findWordsContaining(arr,ch));
    }
}
