package Array;

public class SuffleString {
    public static String restoreString(String s, int[] indices) {
        String str="";
        for(int i=0;i<indices.length;i++){
            char ch=s.charAt(i);
//            str.charAt(indices[i])=ch;
        }
        return str;
    }
    public static void main(String[] args) {
        int [] arr={4,5,6,7,0,2,1,3};
        String str="codeleet";
        System.out.println(restoreString(str,arr));
    }
}
