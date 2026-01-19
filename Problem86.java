class Problem86 {
    static class Node{
        int data;Node left,right;
        Node(int d){ data=d; }
    }
    static Node lca(Node r,int p,int q){
        if(r.data>p && r.data>q) return lca(r.left,p,q);
        if(r.data<p && r.data<q) return lca(r.right,p,q);
        return r;
    }
    public static void main(String[] args){
        Node root=new Node(6);
        root.left=new Node(2);
        root.right=new Node(8);
        System.out.println(lca(root,2,8).data);
    }
}
