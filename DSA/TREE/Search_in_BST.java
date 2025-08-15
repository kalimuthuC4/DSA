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
    public static boolean SearchinBST(Node root,int data){
        while(root!=null){
            if(root.val == data){
                return true;
            }
            else if(root.val>data){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        return false;
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
		System.out.println("Search:");
        System.out.print(SearchinBST(nn1,90));//calling
		System.out.println();
	}
}
