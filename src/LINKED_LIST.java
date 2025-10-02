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
        Node newnode =new Node(val);
        Node temp =head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        newnode.next =temp.next;
        temp.next=newnode;
    }
    public void Delete(int pos){
        Node temp = head; //for pos node save
        Node prev = null; //for previous node of position node
        for(int i=1;i<=pos;i++){  //jump untill node to be detected
            prev =temp;      //keep track of the previous node
            temp=temp.next;  //jump to the next node
        }
        prev.next=temp.next;    //assign the pointers like (position's previous node with the positions next node)
    }

    public static void main(String[] args) {
          LINKED_LIST LLR =new LINKED_LIST();
          LLR.insertAtBeg(9);
          LLR.insertAtBeg(10);
          LLR.insertAtPosition(2,69);
          LLR.Disply();
          LLR.insertAtPosition(1,6969);
          LLR.Disply();

          LLR.Delete(1);
          LLR.Disply();
          LLR.Disply();
    }

}
