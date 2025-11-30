class queue{
    static int max_size = 20;
    int[] arr = new int[max_size];    // initialize reference variables
    int front,rear;

    queue(){
        front = -1;         // declare -1 in the constructor
        rear = -1;
    }
    public void enqueue(int val){
        if(rear == max_size){
            System.out.println("queue is full");
        }
        if(front == -1){     // point the first element to the front varible from -1 to 0;
            front++;
        }
        arr[++rear] = val;    // regularly add elements
    }
//    public int dequeue(){
//        if(front == -1 || front >rear ){   //   check if the queue is empty and also index out of bount (first> rear)
//            System.out.println("queue is empty");
//        }
//        return arr[front++];   // return the first element          NOTE: IT WASTES MUCH AMOUNT OF SPACE IN THE QUEUE BECAUSE FRONT DOES NOT GO BACK
//    }
    public  int dequeue(){               // ITS AN ANOTHER DEQUEUE METHOD (ITS SAVES MORE SPACES IN THE ARRAY LIKE REAARANGE THEM
        if (front == -1){
            System.out.println("queue is empty");
            return -1;
        }
        int temp = arr[0];                // STORE SAFELY THE FRONT ELEMENT
        for(int i = 1;i <= rear;i++){
            arr[i -1 ] = arr[i];            //SWAPPING THE VALUES
        }
        rear--;                             // DECREMENT THE REAR
        return temp;                        // RETURN THE FRONT
    }


    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);   // print the queue as form the front and endit in rear
        }
    }

}
public class QUEUE_USING_ARRAY {
    static void main(String[] args) {
        queue kas = new queue();
        kas.enqueue(12);
        kas.enqueue(11);
        kas.enqueue(10);
        kas.enqueue(9);
        kas.enqueue(8);
        kas.enqueue(7);
        kas.dequeue();
        kas.dequeue();
        kas.display();

    }
}
