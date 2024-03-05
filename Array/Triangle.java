package Array;
import java.util.ArrayList;
import java.util.List;
public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int k=0,sum=0,indx=0;
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<triangle.size();i++){
            List<Integer> subList=triangle.get(i);
            if(i==0){
                sum+=subList.get(k);
            }else {
                minimum = Math.min(subList.get(k), subList.get(k + 1));
                if(minimum==subList.get(k+1)){
                    k++;
                }
                System.out.println(minimum);
                sum += minimum;

            }
        }
        return sum;

    }
    public static void main(String[] args) {
        List<List<Integer>> triangle=new ArrayList<>();
        triangle.add(List.of(2));
        triangle.add(List.of(3,4));
        triangle.add(List.of(6,5,7));
        triangle.add(List.of(4,1,8,3));
        System.out.println( minimumTotal(triangle));
    }
}
