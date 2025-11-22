import java.sql.SQLOutput;
import java.util.*;
class unlimitedArray{
    private static final int initialcapacity =  16;
    private int size;
    private int capacity;
    private int[] kast;

    unlimitedArray(){
        kast =new int[initialcapacity];
        size=0;
        capacity =initialcapacity;
    }
    public void allElements(int value){
        Scanner sc =new Scanner(System.in);
        for(int k=size;k<value;k++){
            kast[k]= sc.nextInt();
            size++;

        }
    }
    public void add(int value){
        if(size == capacity){
            expandArray();
        }
        kast[size++]=value;
    }
    private void  expandArray(){
        capacity =capacity*2;
        kast =java.util.Arrays.copyOf(kast,capacity);
    }
    public void display(){
        for(int i=0;i< kast.length;i++){
            System.out.println(kast[i]+" ");
        }
    }
    public  void insertAtposition(int val,int pos){
        if(size==capacity){
            expandArray();
        }
        for(int i=size-1;i>=pos;i--){
            kast[i]=kast[i-1];
        }
        kast[pos]=val;
        size++;
    }
    public void deleteAtpos(int pos){
        for(int i=pos+1;i<size;i++){
            kast[i-1]=kast[i];
        }
        size--;
    }

    public void deleteAtend(){
        kast[--size]= 9;

        System.out.println(size);

    }
    public void get(int index){
        System.out.println(kast[index]);
    }

    public void update(int pos,int value){
        kast[pos]=value;
    }

    public int search(int value){
        for(int j=0;j<kast.length;j++){
            if(kast[j] == value){
                return j;
            }
        }
        return -1;
    }
    public boolean contains(int value){
        for(int m=0;m<size;m++){
            if(kast[m]==value){
                return true;
            }
        }
        return false;
    }


}


public class ARRAY_SIZE_UNLIMITED {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=0;
        int pos;
        unlimitedArray kas =new unlimitedArray();

        while (true){
            System.out.println("1-ENTER THE ELEMENTS");
            System.out.println(("2-INSERT ELEMENTS"));
            System.out.println("3-INSERT AT THE SPECIFIED POSITION");
            System.out.println("4-DELETE AT THE SPECIFIED POSITION");
            System.out.println(("5-DISPLAY THE ARRAY"));
            System.out.println("6-DELETE THE LAST ELEMENT AND DISPLAY THE ARRAY");
            System.out.println("7-GET THE VALUE AT THE INDEX");
            System.out.println("8-UPDATE THE VALUE AT THE INDEX");
            System.out.println("9-SEARCH THE VALUE RETURN THE INDEX");
            System.out.println("10-CONTAINS THE ELEMENT:");
            System.out.println("11-EXIT");
            System.out.println(("ENTER YOUR NUMBER:"));
            int val=sc.nextInt();
            switch (val){
                case 1:
                    System.out.println("1-ENTER THE ELEMENTS:");
                    value=sc.nextInt();
                    kas.allElements(value);
                    break;
                case 2:
                    System.out.println(("2-INSERT ELEMENTS:"));
                    value= sc.nextInt();
                    kas.add(value);
                    break;
                case 3:
                    System.out.println("3-INSERT AT THE SPECIFIED POSITION");
                    System.out.println("Enter The Value");
                    value= sc.nextInt();
                    System.out.println("Enter the Position:");
                    pos= sc.nextInt();
                    kas.insertAtposition(value,pos);
                    break;
                case 4:
                    System.out.println("4-DELETE AT THE SPECIFIED POSITION");
                    value= sc.nextInt();
                    kas.deleteAtpos(value);
                    break;
                case 5:
                    System.out.println(("5-DISPLAY THE ARRAY"));
                    kas.display();
                    break;
                case 6:
                    System.out.println("6-DELETE THE LAST ELEMENT AND DISPLAY THE ARRAY");
                    kas.deleteAtend();
                    kas.display();
                    break;
                case 7:
                    System.out.println("7-GET THE VALUE AT THE INDEX");
                    value = sc.nextInt();
                    kas.get(value);
                    break;
                case 8:
                    System.out.println("8-UPDATE THE VALUE AT THE INDEX");
                    pos = sc.nextInt();
                    value = sc.nextInt();
                    kas.update(pos,value);
                    break;
                case 9:
                    System.out.println("9-SEARCH THE VALUE RETURN THE INDEX");
                    value = sc.nextInt();
                    System.out.println(kas.search(value));
                    break;
                case 10:
                    System.out.println("10-CONTAINS THE ELEMENT:");
                    value = sc.nextInt();
                    System.out.println(kas.contains(value));
                    break;
                case 11:
                    System.out.println("6-EXITED");
                    System.exit(0);

                default:
                    System.out.println("INVALID NUMBER");
            }
        }
    }
}
