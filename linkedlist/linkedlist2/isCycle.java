public class isCycle{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // step 1 = create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        
        //2 newNode next=head
        newNode.next=head;

        //3
        head=newNode;
    }

    public void addLast(int data){
        // step 1 = create new node
        Node newNode=new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        size++;
        tail.next=newNode;

        tail=newNode;
    }

    public void addMiddle(int data,int idx){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        int i=0;
        Node temp=head;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }

    public void print(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //floyy cycle algo
    public static boolean iscycle(){
        Node slow=head;
        Node fast=head;

        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void removecycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false)return;
        
        //finding meeting point
        slow=head;
        Node prev =null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //remove cycle -> last.next=null
        prev.next=null;
        
    }
    public static void main(String[] args) {
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(iscycle());
        removecycle();
        System.out.println(iscycle());

    }
}