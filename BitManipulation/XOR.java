package BitManipulation;

public class XOR {
    public static int[] decode(int[] encoded, int first) {
        int [] res=new int[encoded.length+1];
        int k=0;
        for(int i=0;i<=encoded.length;i++){
            if(i==0){
                res[k]=first;
                k++;
            }
            if(i==1){

                res[k]=first^encoded[i-1];
                k++;
            }
            if(i>=2){

                res[k]=encoded[i-2]^encoded[i-1];
                k++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int first=1;
//        System.out.println(decode(arr,first));
        int [] res=decode(arr,first);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]);
        }

    }
}
