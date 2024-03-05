package OOPs;

public class staticKeyword {
    static int val=3;
    void getWork(){
        System.out.println("I'm working now");
        System.out.println(val);
    }
    void greeting(){
        System.out.println("Hello Everyone");
        getWork();
    }
    public static void main(String[] args) {
        //greeting();  //This is not working because non static method depend on objects
    staticKeyword obj=new staticKeyword();
    obj.val+=2;
    obj.greeting();
    }
}
