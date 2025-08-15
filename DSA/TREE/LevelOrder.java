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
    public static void LevelOrder(Node root){
        LinkedList<Node> q = new LinkedList<>();
        q.addLast(root);
        while(q.size()>0){
            int s = q.size();
            for(int i=0;i<s;i++){
                Node rem = q.removeFirst();
                System.out.print(rem.val+" ");//LevelOrder
                if(rem.left!=null){
                    q.addLast(rem.left);
                }
                if(rem.right!=null){
                    q.addLast(rem.right);
                }
            }
        }
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
		System.out.println("LevelOrder:");
		LevelOrder(nn1);
		System.out.println();
	}
}
