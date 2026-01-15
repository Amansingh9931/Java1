public class OOPS{
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setcolor("Blue");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());
        p1.setcolor("pink");
        System.out.println(p1.getcolor());
        
        // BankAccount myacc=new BankAccount();
        // myacc.username="Aman";
        // myacc.setpass("Aura12");
    }
} 
// class BankAccount{
//     public String username;
//     private String password;
//     public void setpass(String pwd){
//         password=pwd;
//     }
// }
class Pen{
    private String color;
    private int tip;

    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip; 
    }

    void setcolor(String newcolor){
        this.color=newcolor;
    }
    void settip(int tip ){
        this.tip=tip;
    }
}