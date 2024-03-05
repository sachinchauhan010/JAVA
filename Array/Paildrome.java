package Array;

public class Paildrome {
    public static String firstPalindrome(String[] words) {
//        boolean flag=true;
        int flag=1;
        String ans="";
        for(int i=0;i<words.length;i++){
            for(int j=0;j<=words[i].length()/2;j++){
                int len=words[i].length();
//                System.out.println(words[i]);
                if(words[i].charAt(j)!=words[i].charAt(len-1-j)){
                    System.out.println(words[i]);
                    System.out.println(words[i].charAt(j));
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                ans=words[i];
                System.out.println(ans);
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String [] arr={"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(arr));
    }
}
