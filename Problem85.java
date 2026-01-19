class Problem85 {
    static class Node{
        int data;Node left,right;
        Node(int d){ data=d; }
    }
    static int max=Integer.MIN_VALUE;
    static int dfs(Node r){
        if(r==null) return 0;
        int l=Math.max(0,dfs(r.left));
        int rt=Math.max(0,dfs(r.right));
        max=Math.max(max,l+rt+r.data);
        return Math.max(l,rt)+r.data;
    }
    public static void main(String[] args){
        Node root=new Node(-10);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);
        dfs(root);
        System.out.println(max);
    }
}
