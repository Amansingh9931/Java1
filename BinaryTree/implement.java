
import java.util.*;

public class implement{
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    } 

    public static void display(Node root){
        if(root==null) return ;
        System.out.print(root.val+" -> ");
        if(root.left!=null)System.out.print(root.left.val+" ");
        if(root.right!=null)System.out.print(root.right.val);
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static void pre(Node root){
        if(root==null)return ;
        System.out.print(root.val+ " ");
        pre(root.left);
        pre(root.right);
    }

    public static int size(Node root){
        if(root==null)return 0;
        return 1 + size(root.left) + size(root.right);
    }

    public static int max(Node root){
        if(root==null)return Integer.MIN_VALUE;
        int a= root.val;
        int b=max(root.left);
        int c=max(root.right);
        return Math.max(a, Math.max(b,c));
    }

    public static int height(Node root){
        if(root==null)return 0;
        if(root.left==null && root.right==null)return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void nthLevel(Node root,int n){
        if(root==null)return ;
        if(n==1){
            System.out.print(root.val+" ");
            return ;
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }

    public static void bfs(Node root){
        Queue<Node> q=new LinkedList<>();
        if(root!=null)q.add(root);
        while(q.size()>0){
            Node temp=q.peek();
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }


    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(6);
        b.right=e;
        // display(root);
        // pre(root);
        // System.out.print(size(root));
        // System.out.print(max(root));
        // System.out.print(height(root));
        // nthLevel(root, 2);
        bfs(root);

    }
}