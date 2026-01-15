public class construc{
    public static void main(String[] args) {
        student s1=new student("Aman");
        System.out.println(s1.name);
    }
}

class student{
    String name; 
    int roll;

    student(String name){
        System.out.println("Constructor called");
        this.name=name;
        
    }
}