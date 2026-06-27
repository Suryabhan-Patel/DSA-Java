public class code199 {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static boolean cycle(Node head){
        if(head.next==null) return false;
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            if(slow==fast) return true;
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head= new Node(10);
        Node second= new Node(20);
        Node third= new Node(30);
        Node fourth= new Node(30);
        fourth.next=second;
        head.next=second;
        second.next=third;
        third.next=fourth;
     Node temp=head;
    /* while(temp!=null){
        System.out.println(temp.val);
        temp=temp.next;
     }*/
     System.out.println(cycle(head));
    }
    
}
