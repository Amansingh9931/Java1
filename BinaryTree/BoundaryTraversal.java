
import java.util.*;

public class BoundaryTraversal{
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


    public static Node constructBFS(String[] arr){
        int x=Integer.parseInt(arr[0]);
        int n=arr.length;
        Node root=new Node(x);
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(i<n-1){
            Node temp=q.remove();
            Node left=new Node(1);
            Node right=new Node(2);
            if(arr[i].equals(""))left=null;
            else{
                int l=Integer.parseInt(arr[i]);
                left.val=l;
                q.add(left);
            }
            if(arr[i+1].equals(""))right=null;
            else{
                int r=Integer.parseInt(arr[i+1]);
                right.val=r;
                q.add(right);
            }
            temp.left=left;
            temp.right=right;
            i+=2;
        }
        return root;
    }
    private static void bottomB(Node root){
        if(root==null)return;
        if(root.left==null && root.right==null){
            System.out.print(root.val+" ");
            return;
        }
        bottomB(root.left);
        bottomB(root.right);
    }
    private static void rightB(Node root){
        if(root==null)return;
        if(root.left==null && root.right==null)return;
        if(root.right!=null) rightB(root.right);
        else  rightB(root.left);
        System.out.print(root.val+" ");

    }
    private static void boundaryDisplay(Node root){
        leftB(root);
        // System.out.println();
        bottomB(root);
        // System.out.println();
        rightB(root.right);
    }
    private static void leftB(Node root){
        if(root==null)return;
        if(root.left==null && root.right==null)return;
        System.out.print(root.val+" ");
        if(root.left!=null) leftB(root.left);
        else leftB(root.right);
    }
    public static void main(String[] args){
        String[] arr={"1","2","3","4","5","","6","7","","8","","9","10","","11","","12","","13","","14","15","16","","17","","","18","","19","","","","20","21","22","23","","24","25","26","27","","","28","",""};
        Node root=constructBFS(arr);
        // int level=height(root)+1;
        // for(int i=1;i<=level;i++){
        //     nthLevel(root, i);
        //     System.err.println();
        // }
        boundaryDisplay(root);
    }
}