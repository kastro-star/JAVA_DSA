class doublylinked{
    Node head;
    Node tail;
    doublylinked(){
        head = null;
        tail =null;
    }
    class Node{
        int data;
        Node next;
        Node pre;
        Node(int val){
            data = val;
            next = null;
            pre =null;
        }
    }
    public void insertatbegging(int val){
        Node newnode = new Node(val);
        if(head == null){ // if the head is empty assign head and tail as the same node
            head = newnode;
            tail = newnode;
        }
        else{
            head.pre = newnode; // assign pre node(reference) as new node foe backtrack
            newnode.next = head;
            head = newnode;
        }
    }
    public void display(){
        Node temp =head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void displayreverse(){
        Node temp = tail;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.pre;
        }
    }
    public void insertatpos(int pos,int val){
        Node newnode =new Node(val);
        if(pos == 0){
            insertatbegging(val);
            return;
        }
        else{
            Node temp =head;
            for(int i=1;i<pos;i++){
                temp = temp.next;
            }
            newnode.next = temp.next;
            newnode.pre =temp;
            temp.next.pre = newnode;
            temp.next=newnode;
        }
    }
    public void deleteatpos(int vaal,int pos){
        if(pos == 0){
            head = head.next;
            if(head == null) {
                tail = null;
            }
            head.pre = null;
            return;
        }
        Node temp =head;
        Node prevo = null;
        for(int i =0 ;i<=pos;i++){
            prevo = temp;
            temp = temp.next;
        }
        prevo.next =temp.next;
        if(temp.next == null){
            tail =prevo;
        }
        else {
            temp.next.pre = prevo;
        }

    }
}
public class DOUBLY_LINKED_LIST {
    static void main(String[] args) {
    doublylinked list =new doublylinked();
    list.insertatbegging(2);
    list.insertatbegging(21);
    list.insertatbegging(67);
    list.insertatbegging(90);
    list.insertatpos(2,33);
    list.display();
   // list.displayreverse();
    }
}
