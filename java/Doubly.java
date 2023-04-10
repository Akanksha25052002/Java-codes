/* public class Doubly {
    public static void main(String[] args) {
        Node head=null;
        // Node temp1=null;
        for(Node temp= head;temp!=null;temp=temp.next){
            for(Node temp1=temp1.next;temp1!=null;temp1=temp1.next){
                if(temp.data>temp1.data){
                    int temp3=temp.data;
                    temp.data=temp1.data;
                    temp1.data=temp3;
                }
            }

            System.out.println();
        }
    }
}
class Node{
    int data;
    Node next,head,temp,tail,prev,temp1,temp3;
    Node(int data){
        prev=null;
        this.data=data;
        next=null;
    }

    void insert(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            tail=new_node;
        }
        else{
            // tail.next=new_node;
            // prev=tail;
            // tail=tail.next;
            temp3.next=temp1;
            temp.next=temp1.next;
            temp1.next=temp;

        }
    }
}  */

public class Doubly {

    //Represent a node of the doubly linked list 
  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    //Represent the head and tail of the doubly linked list  
    Node head, tail = null;  
  
    //addNode() will add a node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //If list is empty  
        if(head == null) {  
            //Both head and tail will point to newNode  
            head = tail = newNode;  
            //head's previous will point to null  
            head.previous = null;  
            //tail's next will point to null, as it is the last node of the list  
            tail.next = null;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode's previous will point to tail  
            newNode.previous = tail;  
            //newNode will become new tail  
            tail = newNode;  
            //As it is last node, tail's next will point to null  
            tail.next = null;  
        }  
    }  
  
    //sortList() will sort the given list in ascending order  
    public void Doubly() {  
        Node current = null, index = null;  
        int temp;  
        //Check whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {  
           
            for(current = head; current.next != null; current = current.next) {  
                
                for(index = current.next; index != null; index = index.next) {  
                    //If current's data is greater than index's data, swap the data of current and index  
                    if(current.data > index.data) {  
                        temp = current.data;
                        current.data = index.data;  
                        index.data = temp;
                    }  
                }  
            }  
        }  
    }  
  
    //display() will print out the nodes of the list  
    public void display() {  
        //Node current will point to head  
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
  
    public static void main(String[] args) {  
  
        SortList dList = new SortList();  
        //Add nodes to the list  
        dList.addNode(7);  
        dList.addNode(1);  
        dList.addNode(4);  
        dList.addNode(5);  
        dList.addNode(2);  
  
        //Displaying original list  
        System.out.println("Original list: ");  
        dList.display();  
  
        //Sorting list  
        dList.sortList();  
  
        //Displaying sorted list  
        System.out.println("Sorted list: ");  
        dList.display();
    }
} 