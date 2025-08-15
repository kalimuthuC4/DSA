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
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");//root
        preorder(root.left);//left
        preorder(root.right);//right
    }
    
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);//left
        System.out.print(root.val+" ");//root
        inorder(root.right);//right
    }
    
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);//left
        postorder(root.right);//right
        System.out.print(root.val+" ");//root
    }
    

	public static void main(String[] args) {
		Node nn1 = new Node(10);
		Node nn2 = new Node(5);
		Node nn3 = new Node(15);
		Node nn4 = new Node(3);
		Node nn5 = new Node(8);
		Node nn6 = new Node(12);
		Node nn7 = new Node(18);
		nn1.left = nn2;
		nn1.right = nn3;
		nn2.left = nn4;
		nn2.right = nn5;
		nn3.left = nn6;
		nn3.right = nn7;
		System.out.println("preorder:");
		preorder(nn1);//calling the func
		System.out.println();
		System.out.println("inorder:");
		inorder(nn1);//calling the func
		System.out.println();
		System.out.println("postorder:");
		postorder(nn1);//calling the func
	}
}
