//BINARY SEARCH IS ONE OF THE BEST SEARCH BECAUSE ITS 
//TIME COMPLEXITY IS O(LOG N) 
//LINEAR SEARCH TIME COMPLEXITY IS O(N) -- ITERATE THROUGH ALL THE ELEMENTS IN THE UNTILL FIND THE ELEMENT IT DOES NO SUITABLE FOR BIGGER LIKE 1000000 INDEXES ;
// SO BINEARY SERCH IS THE BEST THAT NOT ITERATE THROUGH ALL SO ITS RUN IN O(LOG N)



// ITS AN LINEAR SEARCH 
        // BEST SUITBALE FOR SMALLER ARRAYS O(N)

        //BEST CASE -- DIECTLY FOUND THE TARGET  -- O(1)
        //WORST CASE -- ITERATE THROUNG ALL LAST ELEMENT IS THE TARGET -- O(N)



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
    public int  Search(int value){
        Node temp=head;
        while (temp.next != null){
            if(temp.data == value){
                return temp.data;
            }
            temp=temp.next;
        }
        return -1;
    }
    public boolean contains(int value){
        Node temp=head;
        while(temp.next !=null){
            if(temp.data == value){
                return true;
            }
            temp =temp.next;
        }
        return false;
    }

    public void reverse(){
        Node pre = null;
        Node current  = head;
        Node next =head.next;
        while (current != null ){
            next  = current.next;
            current.next = pre ;
            pre = current;
            current = next;

        }
        head = pre;
    }
    public static void main(String[] args) {
        LINKED_LIST LLR =new LINKED_LIST();
        LLR.insertAtBeg(9);
        LLR.insertAtBeg(10);
        LLR.insertAtBeg(23);
        LLR.insertAtBeg(32);
        LLR.insertAtBeg(21);
        LLR.reverse();
        LLR.Disply();
    }

}
