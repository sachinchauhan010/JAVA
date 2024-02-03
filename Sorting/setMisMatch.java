package Sorting;

public class setMisMatch {
    public static void findErrorNums(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
//                swap
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }


        int[] res={-1,-1};
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                res[0]=arr[j];
                res[1]=j+1;
            }
        }
        System.out.println(res[0]+"  "+res[1]);
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        findErrorNums(arr);
    }
}
