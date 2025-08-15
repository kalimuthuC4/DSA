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

class Pair{
    Node node;
    int state;
    Pair(Node node,int state){
        this.node = node;
        this.state=state;
    }
}

public class Main
{
    public static void inorder(Node root){
        Stack<Pair> s = new Stack<>();
        s.push(new Pair(root,0));
        while(s.size()>0){
            Pair top = s.peek();
            if(top.state==0){
                top.state++;
                if(top.node.left!=null)
                s.push(new Pair(top.node.left,0));
            }else if(top.state == 1){
                System.out.print(top.node.val+" ");//inoder
                if(top.node.right!=null)
                s.push(new Pair(top.node.right,0));
                top.state++;
                
            }else{
                s.pop();
            }
        }
    }
    public static void preorder(Node root){
        Stack<Pair> s = new Stack<>();
        s.push(new Pair(root,0));
        while(s.size()>0){
            Pair top = s.peek();
            if(top.state==0){
                top.state++;
                System.out.print(top.node.val+" ");//preorder
                if(top.node.left!=null)
                s.push(new Pair(top.node.left,0));
            }else if(top.state == 1){
                if(top.node.right!=null)
                s.push(new Pair(top.node.right,0));
                top.state++;
                
            }else{
                s.pop();
            }
        }
    }
    public static void postorder(Node root){
        Stack<Pair> s = new Stack<>();
        Pair visited = null;
        s.push(new Pair(root,0));
        while(s.size()>0){
            Pair top = s.peek();
            if(top.state==0){
                top.state++;
                if(top.node.left!=null)
                s.push(new Pair(top.node.left,0));
            }else if(top.state == 1){
                if(top.node.right!=null)
                s.push(new Pair(top.node.right,0));
                top.state++;
                
            }else{
                Pair peeknode = s.peek();//peek
                if(top.node.right!=null && peeknode.node!=top.node){//check the right side is there 
                    top.node = top.node.right; //traverse to right
                    top.state=1;//update the state to one;
                }else{// if there is no right side
                    s.pop();//pop the peek 
                    System.out.print(peeknode.node.val+" ");// print postorder 
                    visited = peeknode; //already visited
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
		preorder(nn1);//calling the func
		System.out.println();
		System.out.println("inorder:");
		inorder(nn1);//calling the func
		System.out.println();
		System.out.println("postorder:");
		postorder(nn1);//calling the func
		System.out.println();
	}
}
