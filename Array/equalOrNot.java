package Array;

public class equalOrNot {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="";
        String str2="";
        for(int i=0;i<word1.length;i++){
            str1+=word1[i];
        }
        System.out.println(str1);

        for(int i=0;i<word2.length;i++){
            str2+=word2[i];
        }
        System.out.println(str2);
        return str1.equals(str2);
    }
    public static void main(String[] args) {
        String [] word1={"ab", "c"};
        String [] word2={"a", "bc"};
        System.out.println( arrayStringsAreEqual(word1,word2));

    }
}
