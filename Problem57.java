class Problem57 {
    static class Node{
        int data;
        Node next;
        Node(int d){ data=d; }
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(0);
        head.next.next=new Node(1);
        int num=0;
        while(head!=null){
            num=num*2+head.data;
            head=head.next;
        }
        System.out.println(num);
    }
}
