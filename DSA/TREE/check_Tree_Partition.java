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
    public static boolean flag = false;
        
    public static int sum(Node root){
        if(root==null)return 0;
        int lrem = sum(root.left);
        int rrem = sum(root.right);
        return lrem+rrem+root.val;
    }
    
public static int checkvalid(Node root,int target){
        if(root == null) return 0;
        int lsum = checkvalid(root.left,target);
        int rsum = checkvalid(root.right,target);
        if(lsum == target || rsum == target){
            flag =  true;
            // break;
        }
        return  root.val+lsum+rsum;
    }
    

public static boolean checkEqualPartition(Node root){
        int val = sum(root);
        if(val%2!=0) return false;
        int target = val/2;
        checkvalid(root,target);
        return flag;
    }

public static void main(String[] args) {
		Node nn1 = new Node(5);
		Node nn2 = new Node(3);
		Node nn3 = new Node(7);
		Node nn4 = new Node(4);
		Node nn5 = new Node(2);
		Node nn6 = new Node(6);
		Node nn7 = new Node(1);
		nn1.left = nn2;
		nn1.right = nn3;
		nn2.left = nn4;
		nn2.right = nn5;
		nn3.left = nn6;
		nn3.right = nn7;
		System.out.println("inorder:");
		boolean val = checkEqualPartition(nn1);//calling the func
		System.out.println(val);
	}
}

//check the sum
//div the sum and store as target
//chexk the checkvalidpartition function and pass the root and target
// To find the equal partition is true or false
