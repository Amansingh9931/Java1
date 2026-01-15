//deque ->stack

// import java.util.*;
// public class DequeuImplementation{
//     static class Stack{
//         Deque<Integer> d=new LinkedList<>();
//         public void push(int data){
//             d.addLast(data);
//         }
//         public int pop(){
//             return d.removeLast();
//         }
//         public int peek(){
//             return d.getLast();
//         }
//     }
//     public static void main(String[] args) {
//         Stack s=new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         System.out.println("peek = "+s.peek());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//         System.out.println(s.pop());


//     }
// }



// deque ->Queue

import java.util.*;
public class DequeuImplementation{
    static class Queue{
        Deque<Integer> d=new LinkedList<>();
        public void add(int data){
            d.addLast(data);
        }
        public int remove(){
            return d.removeFirst();
        }
        public int peek(){
            return d.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue s=new Queue();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println("peek = "+s.peek());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());


    }
}