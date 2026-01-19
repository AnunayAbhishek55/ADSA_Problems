import java.util.*;
class Problem87 {
    static class Node{
        int data;Node left,right;
        Node(int d){ data=d; }
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(7);
        root.right=new Node(0);
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int n=q.size();
            int sum=0;
            for(int i=0;i<n;i++){
                Node cur=q.poll();
                sum+=cur.data;
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}
