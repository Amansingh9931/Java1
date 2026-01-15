

public class merge{
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






    
    private Node getMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;
        while(head1 !=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }

    public Node mergesort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid=getMid(head);
        //left & right Mergesort
        Node righthead=mid.next;
        mid.next=null;
        Node newLeft=mergesort(head);
        Node newRight=mergesort(righthead);
        //merge
        return merge(newLeft,newRight);
    }


    public void zigzag(Node head){
        //find mid
        Node mid=getMid(head);

        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextl,nextr;

        //alt merge 
        while(left!=null && right!=null){
            nextl=left.next;
            left.next=right;
            nextr=right.next;
            right.next=nextl;

            left=nextl;
            right=nextr;
        }

    }
    public static void main(String[] args) {
        merge ll=new merge();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // 1->2->3->4->5

        ll.print();
        // ll.head=ll.mergesort(ll.head);
        ll.zigzag(head);
        ll.print();
    }
}