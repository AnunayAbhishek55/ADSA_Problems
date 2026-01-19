import java.util.*;
class Problem90 {
    static class Node{
        int data;Node left,right;
        Node(int d){ data=d; }
    }
    static class Pair{
        Node n;int h;
        Pair(Node n,int h){ this.n=n; this.h=h; }
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            map.putIfAbsent(p.h,p.n.data);
            if(p.n.left!=null) q.add(new Pair(p.n.left,p.h-1));
            if(p.n.right!=null) q.add(new Pair(p.n.right,p.h+1));
        }
        for(int x:map.values()) System.out.print(x+" ");
    }
}
