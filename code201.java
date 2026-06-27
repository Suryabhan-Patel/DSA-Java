
public class code201 {
    public static class  Node {
    Node next;
    int val;
    Node(int val){
        this.val=val;
        this.next=null;
    }
    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }}

    public static Node insertatbegin(Node head){ 
        Node newhead= new Node(100);
        newhead.next=head;
        return newhead;
    }
    public static Node insertatend(Node head,int val){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newnode=new Node(val);
        temp.next=newnode;
        newnode.next=null;
        return head;

    }
    public static Node deleteinmiddle(Node head,int val){
        Node temp=head;
        Node prev=null;
        while(temp.val!=val){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        return head;

    }

    public static Node reverse(Node head){
        if(head==null|| head.next == null){
            return head;
        }
        Node first=head;
        Node second=head.next;
        Node F= head;
        while(second!=null){
            Node temp= second.next;
            second.next=first;
            first=second;;
            second=temp;

        }
        F.next=null;

    return first;}

    public static void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static int findlen(Node head){
        if(head==null) return 0;
        Node temp=head;
        int count=0;
        while(temp!=null){
           count++;
           temp=temp.next;
        }
        return count;
    }

    public static boolean search(Node head,int target){
        Node temp=head;
        while(temp!=null){
            if(temp.val==target) return true;
        }
        return false;
    }

    public static Node middle(Node head){
        if(head==null)return head;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;    }
  public static void main(String[] args) {
    Node head= new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);
    head.next=second;
    second.next=third;
    third.next=fourth;
    System.out.println(findlen(head));
    traverse(head);
   Node h1= reverse(head);
   traverse(h1);
   System.out.println(findlen(h1));

 
  }    
    
}
