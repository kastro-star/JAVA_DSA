class queuelinkedlist{
    class  Node{           // base structure of the node
        int data;          // data declare
        Node next;        // reference variable

        Node(int val){           // assign values via constructor of node
            data = val;
            next = null;
        }
    }
    Node front,rear; // reference variable
    queuelinkedlist(){
        front = null;          // constructors for assign both as null
        rear  = null;
    }
    public void enqueue(int val){           // add elements in last
        Node newnode = new Node(val);   // create nodes
        if(front == null ){
            front  = newnode;      // check its an first node
        }
        if(rear == null){
            rear = newnode;      // check its an second node
        }else {
            rear.next = newnode;  // next all other elements are stored continuesly
            rear = newnode;

        }
    }
    public int dequeue(){        // return the first element and delete it
        Node temp = front;       // store the front data in tempry variiable
        front =front.next;        // assign front's next as front
        if(front == null){
            rear =null;           // if front's next is an null also change the rear to null
        }
        return temp.data;        // finally return the front data(safely with temp variable)

    }
    public void diplay(){
        Node temp = front;
        while(temp != null){                    // print the node data's
            System.out.println(temp.data);
            temp =temp.next;
        }
    }

    public boolean isEmpty(){
        return front== null;                 // chack the linked listis empty
    }

    public int getthefirstelement(){
        return front.data;                      // get only the first element's data
    }
}

public class QUEUE_USING_LINKEDLIST {
    static void main(String[] args) {
        queuelinkedlist kas = new queuelinkedlist();
        kas.enqueue(12);
        kas.enqueue(11);
        kas.enqueue(10);
        kas.enqueue(2);
        //kas.dequeue();
        kas.diplay();
        System.out.println(kas.getthefirstelement());
    }


}
