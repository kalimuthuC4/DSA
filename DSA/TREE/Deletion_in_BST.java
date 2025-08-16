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
    public static Node deletionInBST(Node root,int k){
        if(root == null){
            return null;
        }
        if(root.val == k){
            if(root.left==null && root.right==null){
               return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                Node peek = root.left;
                while(peek.right!=null){
                    peek = peek.right;
                }
                root.val = peek.val;
                root.left = deletionInBST(root.left,peek.val);
            }
            
        }else if(root.val>k){
            root.left = deletionInBST(root.left,k);
        }
        else{
            root.right = deletionInBST(root.right,k);
        }
        return root;
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
		deletionInBST(nn1,50);
		System.out.println();
	}
}
