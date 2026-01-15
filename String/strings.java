

public class strings{
    public static void main(String[] args) {
        // char arr[]={'a','b','c','d'};
        // String str="abcd";
        // String str2=new String("xyz");

        // Scanner sc=new Scanner (System.in);
        // String name;
        // name=sc.nextLine();
        // System.out.println(name);
        // System.out.println(name.length());

        //concatenation
        String firstName="Aman";
        String LastName="Kumar";
        String fullName=firstName + " " + LastName;
        System.out.println(fullName);
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i)+" ");
        }
    }
}