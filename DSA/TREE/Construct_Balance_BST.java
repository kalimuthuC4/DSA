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
    public static Node construct(int[] arr,int l,int h){
        if(l>h)return null;
        
        int m = l+(h-l)/2;
        Node r = new Node(arr[m]);
        r.left = construct(arr,l,m-1);
        r.right = construct(arr,m+1,h);
        return r;
    }
    // public static void inorder(Node r){
    //     if(r==null){
    //         return;
    //     }
    //     inorder(r.left);
    //     System.out.print(r.val+" ");
    //     inorder(r.right);
    // }
	public static void main(String[] args) {
		int[] a ={10,20,30,40,50,60,70,80};
		Node nn = construct(a,0,a.length-1);
// 		inorder(nn);
	}
}
