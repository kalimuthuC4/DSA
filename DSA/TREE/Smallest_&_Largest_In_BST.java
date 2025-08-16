import java.util.*;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}

public class Main
{
    public static void Smallest(Node root){
        // optimized
        if(root ==null){
            System.out.println(-1);
        }
        while(root.left!=null){
            root=root.left;
        }
        System.out.println(root.val+" ");
        
        // -----own solution----
        // if(root==null)
        // System.out.println(-1);
        // Node cur=null;
        // while(root!=null){
        //     cur = root;
        //     if(root.left!=null)
        //     root = root.left;
        //     else{
        //         break;
        //     }
        // }
        // System.out.println(cur.val+" ");
    } 
    public static void Largest(Node root){
        if(root==null){
            System.out.println(-1);
        }
        
        while(root.right!=null){
            root = root.right;
        }
        System.out.print(root.val);
    }
	public static void main(String[] args) {
		Node nn1 = new Node(50);
		Node nn2 = new Node(30);
		Node nn3 = new Node(80);
		Node nn4 = new Node(10);
		Node nn5 = new Node(40);
		Node nn6 = new Node(60);
		Node nn7 = new Node(90);
		nn1.left = nn2;
		nn1.right = nn3;
		nn2.left = nn4;
		nn2.right = nn5;
		nn3.left = nn6;
		nn3.right = nn7;
		System.out.println("Smallest element in the BST:");
		Smallest(nn1);
		System.out.println();
		System.out.println("Largest element in the BST:");
		Largest(nn1);
		System.out.println();
	}
}
