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
    public static void IterativeInOrderMethod(Node root){
        Stack<Node> s = new Stack<>();
        Node cur = root;
        while(cur!=null || s.size()>0){
            if(cur != null){
                s.push(cur);
                System.out.print(cur.val+" ");//preorder
                cur = cur.left;
            }else{
                cur = s.pop();
                cur = cur.right;
            }
        }
    }
    public static void IterativePreorderMethod(Node root){
        Stack<Node> s = new Stack<>();
        Node cur = root;
        while(cur!=null || s.size()>0){
            if(cur != null){
                s.push(cur);
                cur = cur.left;
            }else{
                cur = s.pop();
                System.out.print(cur.val+" ");// inorder
                cur = cur.right;
            }
        }
    }
    public static void IterativePostorderMethod(Node root){
        Stack<Node> s = new Stack<>();
        Node cur = root;
        Node lastVisit = null;
        while(cur!=null || s.size()>0){
            if(cur != null){
                s.push(cur);
                cur = cur.left;
            }else{
                Node peekNode = s.peek();//firstly we want to get the peek from the stack
                if(peekNode.right!=null && lastVisit!=peekNode.right){ //check the peekNode has right node 
                    cur = peekNode.right;//make the cur node to the peekNode(rightmost node)
                }else{ // if the peek or left element not having the right node do ( pop the element from the stack and print the top element and mark the lastVisited not as peeknode)
                    s.pop();
                    System.out.print(peekNode.val+" ");
                    lastVisit = peekNode;
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
		System.out.println("preorder:");
		IterativePreorderMethod(nn1);//calling the func
		System.out.println();
		System.out.println("inorder:");
		IterativeInOrderMethod(nn1);//calling the func
		System.out.println();
		System.out.println("postorder:");
		IterativePostorderMethod(nn1);//calling the func
		System.out.println();
	}
}
