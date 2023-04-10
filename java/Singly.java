class Node{
    int data;
    Node next,head,tail,temp;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    void insert(int data){
        tail=New_node();
        Node next=new Node(data);
        if(head==null){
            head=new_Node();
        }
        else{
            tail.next=new_Node();
        }
    }
    
    
    public class Singly {
        public static void main(String[] args) {
            Node m=new Node(0);
            m.insert(10);
            m.insert(20);
        }
        // void display(){
            //     for(temp=head){
                //         temp!=head;
            }
            //     }
            // }
        }


