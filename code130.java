class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
        this.next=null;    }
}
public class code130 {

    public static void traversal(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
  public static Node reverse(Node head){
    Node prev = head;
    Node curr = head.next;

    while(curr != null){
        Node next = curr.next; // store next
        curr.next = prev;      // reverse link
        prev = curr;           // move prev
        curr = next;           // move curr
    }
    head.next=null;
    head=prev;

    return head;} // new hea

    // find middle
    public static Node middle(Node head){
        Node slow= head;
        Node fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node reoroderNode(Node head){
        Node temp = middle(head);
        Node second=reverse(temp.next);
        temp.next=null;
        Node first=head;
        while(second!=null){
            Node temp1 =first.next;
            Node temp2= second.next;
             first.next=second;
             second.next=temp1;

             first=temp1;
             second=temp2;

        }
        return head;

        
    }
    public static void main(String[] args) {
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node fourthNode = new Node(40);
        Node fifthNode = new Node(50);

        Node head= firstNode;
        firstNode.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=fourthNode;
        fourthNode.next=fifthNode;
      traversal(head);
      head=reverse(head);
      System.out.println(" after the reversal");
      traversal(head);
      head=reverse(head);
      Node temp = middle(head);
      System.out.println("the middle node value is "+temp.val);
      System.out.println(" after the reorder");
      head=reoroderNode(head);
      traversal(head);
    }
    
}
