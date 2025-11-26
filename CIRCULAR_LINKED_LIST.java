import com.sun.jdi.PathSearchingVirtualMachine;

import javax.xml.transform.Source;

class circularlinkedlist{
    Node last;
    class Node{
        String data;
        Node next;
        Node(String val){
            data = val;
            next = null;
        }
    }
    circularlinkedlist(){
        last = null;
    }
    public void insertatbegging(String val){
        Node newnode = new Node(val);
        if(last == null){
            newnode.next =newnode;
            last = newnode;
        }else{
            newnode.next = last.next;
            last.next =newnode;
        }
    }
    public void insertatlast(String val){
        Node newnode = new Node(val);
        if(last == null){
            newnode.next = newnode;
            last = newnode;
        }
        else{
            newnode.next = last.next;
            last.next = newnode;
            last = newnode;
        }
    }
    public void display(){
        Node temp = last.next;
        do{
            System.out.println(temp.data);
            temp = temp.next;
        }while (temp!=last.next);

    }
    public void deleteatbeg(){
        if(last == null){
            System.out.println("empty");
        }
        if (last.next == last) {
            last = null;
        }else{
            last.next = last.next.next;
        }
    }
    public void deleteatend(){
        if(last == null){
            System.out.println("empty");
        }
        if(last.next == last){
            last =null;
        }
        else {
            Node temp = last.next;
            while(temp.next != last){
                temp=temp.next;
            }
            temp.next = last.next;
            last = temp;
        }
    }

}
public class CIRCULAR_LINKED_LIST {
    static void main(String[] args) {
        circularlinkedlist kas = new circularlinkedlist();
        kas.insertatbegging("kastro");
        kas.insertatbegging("kastrrtrtrt");
        kas.insertatlast("asdsdadas");
        kas.insertatlast("sdaasddsa");
        kas.display();
        kas.deleteatbeg();
        kas.deleteatend();
        kas.display();

    }
}
