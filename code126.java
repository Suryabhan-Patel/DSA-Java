// linked list in java
class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next=null;
    }
}


public class code126 {
    
public static Node insert_at_begining(int data, Node head){
    Node newnode= new Node(data);
    newnode.next=head;
    head=newnode;
    return head;
}
public static void traversal(Node head){
    Node temp= head;
    int node=1;
    System.out.println("data at "+ node +" is " + temp.data);
    temp=temp.next;
    while(temp!=null){
        node++;
        System.out.println("data at "+ node +" is " + temp.data);
        temp=temp.next;
    }}
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        Node head= n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        //n5 already pointing towards null
   
    head= insert_at_begining(5, head);
    System.out.println(" after addin node");
    traversal(head);
    }

    
}
