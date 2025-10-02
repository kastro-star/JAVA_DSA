import org.w3c.dom.Node;

import java.util.*;

public class LINKED_LIST {
    Node head;
    class Node{//create the node(structure of the node)
        int data;  //data
        Node next; //reference
        Node(int val){ //constructor for assign the values for node
            data=val;
            next =null;
        }
    }
    LINKED_LIST(){
        head = null;     //asign  the head to null

    }
    public void insertAtBeg(int val){
        Node newnode  =new Node(val); //creating  nodes like an object with class node
        if(head == null){
            head=newnode; //first node
        }
        else{
            newnode.next=head; //next and next node at beggining of the list
            head=newnode;
        }
    }
    public void Disply(){
        Node temp=head;        //first node in tempory variable
        while (temp != null) {
            System.out.println(temp.data +" ");
            temp =temp.next;         //change the node to next node
        }
    }
    public void insertAtPosition(int pos,int val){
        Node newnode =new Node(val);  //create new node
        if(pos ==0){
            insertAtBeg(val);   // position is 0th element call the insertat begginng method
            return;
        }
        Node temp =head;
        for(int i=1;i<pos;i++){
            temp=temp.next;      //search for the previous node of the postion node
        }
        newnode.next =temp.next;    //assign the new nodes next value is previous(next) --the newnodes neat
        temp.next=newnode;          //previous nodes next is our new node (assign the values carefully)
    }
    public void Delete(int pos){
        if(head == null){
            throw new IndexOutOfBoundsException(pos);
        }
        if(pos == 0){
            head =head.next;
            return;
        }
        Node temp = head; //for pos node save
        Node prev = null; //for previous node of position node
        for(int i=1;i<=pos;i++){  //jump untill node to be detected
            prev =temp;      //keep track of the previous node
            temp=temp.next;  //jump to the next node
        }
        prev.next=temp.next;    //assign the pointers like (position's previous node with the positions next node)
    }
    public void get(int pos){
        Node temp=head;
        if(pos == 0){
            System.out.println(temp.data);  //handle the position 0
            return;
        }
        for(int i=1;i<pos;i++){
            temp = temp.next;
        }
        System.out.println(temp.data);   //get the value of the certained index node

    }
    public void update(int pos,int val){
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        temp.data=val;

    }
    public void deleteAtend(){
        Node temp =head;
        while(temp.next.next != null){
            temp=temp.next;
        }
        temp.next=null;

    }


    public static void main(String[] args) {
          LINKED_LIST LLR =new LINKED_LIST();
          LLR.insertAtBeg(9);
          LLR.insertAtBeg(10);
          LLR.insertAtPosition(2,69);
          LLR.Disply();
          LLR.Delete(0);
          LLR.Disply();
          LLR.get(1);
          LLR.update(1,1000000);
          LLR.get(1);
          LLR.deleteAtend();
          LLR.Disply();
          LLR.insertAtBeg(4310);
          LLR.insertAtBeg(410);
        LLR.Disply();
          LLR.deleteAtend();
          LLR.Disply();
    }

}
