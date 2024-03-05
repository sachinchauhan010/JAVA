package OOPs;

public class basic {
    static class Student{
        int rollno;
        String name;
        float marks;
        Student(int rollno, String name, float marks){
            this.rollno=rollno;
            this.name=name;
            this.marks=marks;
        }
        void getData(){
            System.out.println("Roll no : "+this.rollno +"\nName : "+ this.name+ "\nMarks : "+this.marks);
        }
    }
    public static void main(String[] args) {
//        System.out.println("Hello World");
        Student std=new Student(48,"Sachin Chauhan",38);
        std.getData();
    }
}
