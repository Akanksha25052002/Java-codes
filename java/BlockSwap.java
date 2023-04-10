import java.util.*;

public class BlockSwap {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }
     public static Node head;
     public static Node tail;
     public static int size;

    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=tail.next;
            tail=newNode;
        }
    }
    void display(){
        Node temp;
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the total number of elements: ");
        int n=sc.nextInt();

        System.out.println("Enter the number of elements in A block: ");
        int d=sc.nextInt();


        BlockSwap m=new BlockSwap();
    m.insert(20);
    m.insert(25);
    m.insert(28);
    m.insert(30);
    m.insert(40);
    System.out.println("List before swapping: ");
    m.display();


}

    }


/*class Node{
    int data;
    Node head, tail, temp, next;
        Node newNode=new Node(data);
        Node(int data){
            this.data=data;
            this.next=null;
        }
        void insert(int data){
            tail=newNode;
            Node next=new Node(data);
            if(head==null){
                head=newNode;
            }
            else{
                tail.next=newNode;
            }
        }

        public void display() { 

    Node current = head;
    if(head == null) {
        System.out.println("List is empty");
        return;  
    }  
    while(current != null) {
        //Prints each node by incrementing the pointer.  

        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}
}
public void display() {
    Node head;
    head=null;
    
    Node current = head;
    if(head == null) {
        System.out.println("List is empty");
        return;
    }
    while(current != null) {
       
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}
}*/

/*
       
       
 */