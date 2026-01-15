import java.util.*;

public class stackpack{
    public static void pushBottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str) {
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        // Stack<Integer> s=new Stack<>();
        // s.push(1);
        // s.push(2);
        // pushBottom(s, 5);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        String str="abc";
        String result=reverseString(str);
        System.out.println(result);
    }
}