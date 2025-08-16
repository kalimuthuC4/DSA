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
    public static long prev;
    public static boolean bst;
    public static boolean checkBST(Node root){
        prev = -1;
        bst = true;
        inorder(root);
        return bst;
    }
    public static void inorder(Node root){
        if(root == null && bst)
        return;
        inorder(root.left);
        if(root.val<=prev){
            bst = false;
            return;
        }
        prev = root.val;
        inorder(root.right);
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
		System.out.println("deletionInBST:");
// 		deletionInBST(nn1,50);
		System.out.println(checkBST(nn1));
	}
}
