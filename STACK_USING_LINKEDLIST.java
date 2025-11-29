class stacklinkedlist{
    class Node{                      // creation of the node (structure)
        int data;
        Node next;                    // pointor for move
        Node(int val){
            data = val;
            next = null;          // declaring values via contructor for nodes

        }
    }
    Node top = null;           //  create null to the top
    stacklinkedlist(){
        top =null;              //also initialize null via constructor
    }
    public void  push(int val){
        Node newnode = new  Node(val);     // create an node
        newnode.next  = top;               // assign newnodees next is old node
        top =newnode;                       // assign newnode as top
    }
    public int pop(){
        if(top == null){
            System.out.println("list is empty");
        }
        Node temp = top;                    // temporly store the top
        top = top.next;                     // reassign the top to the top's next
        return temp.data;                   // return the old top
    }

}

public class STACK_USING_LINKEDLIST {
    static void main(String[] args) {
        stacklinkedlist kastro = new stacklinkedlist();
        kastro.push(32);
        kastro.push(2332);
        kastro.push(23);
        System.out.println(kastro.pop());
        System.out.println(kastro.pop());
    }
}
