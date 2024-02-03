package Searching;

public class smallestLetter {
    public static char nextGreatestLetter(char[] letters, int target){
        int start=0,last=letters.length-1;
        while(start<=last){
            int mid=(start+last)/2;
            if(target<letters[mid]){
                last=mid-1;

            }else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];

    }
    public static void main(String[] args) {
        char [] letters={'x','x','y','y','z'};
        int target='x';
        System.out.println(nextGreatestLetter(letters,target));
    }
}
