// linked list
 class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
        this.next=null;
    }
 }

public class code129 {


    // add node on satarting
    public static Node first(Node head){
        Node list0= new Node(57);
        list0.next=head;
        head=list0;
        return head;
    }

    // add on the end
    public static void last(Node head){
        Node temp= head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node list3 =new Node(87);
        temp.next=list3;
    }

    // delete first node
     public static Node delfirst(Node head){
        head=head.next;
        return head;
     }

     // delete at last
     public static Node dellast(Node head){
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
     }
    public static void main(String[] args) {
        
    
    Node list1 = new Node(67);
    Node list2= new Node(77);
    Node head=list1;
    list1.next=list2;
    head=first(head);
    last(head);
    head=delfirst(head);
    head=dellast(head);

    Node temp= head;




    while(temp!=null){
        System.out.println(temp.val);
        temp=temp.next;
    }

   }}
    

