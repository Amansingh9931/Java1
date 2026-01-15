import java.util.*;

// import java.util.ArrayList;
// import java.util.Collections;

public class  sort{
    
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(2);
        list.add(31);
        list.add(4);
        list.add(15);
        System.out.println(list);
        Collections.sort(list); //ascending
        //decending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}