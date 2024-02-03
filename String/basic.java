package String;

import java.util.ArrayList;
public class basic {
    public static void main(String[] args) {

//        Comparing values which is pointing to same variable in Pull
        String name1="Sachin";
        String name2="Sachin";
        System.out.println(name1==name2);


//        Comparing same value is pointing to others variable which is stored in outside the pull but inside the heap
        String name3=new String("Chauhan");
        String name4=new String("Chauhan");
        System.out.println(name3==name4);

//      + operator
        System.out.println("Sachin"+5); //5 is converted through wrapper Integer class into String via toString() method
        String ans=new ArrayList<>(6)+" "+ new ArrayList<>();
        System.out.println(ans);


    }
}
