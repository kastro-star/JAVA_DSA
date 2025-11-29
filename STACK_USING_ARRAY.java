class stack{
    static int maxsize = 50;
    int[] stack = new int[maxsize];     // reference variables and initialize
    int top;

    stack(){
        top = -1;         // declare -1 via constructor ( top is like head in linked list is help to access elements)
    }
    void push(int val){
        if (top == maxsize -1){          // check the top reached
            System.out.println("max array reached");
        }
        else{
            stack[++top] = val;     // store the vales at the top of the stack
        }
    }
    public int pop(){
        if(top == -1){
            System.out.println("stack is empty");    // top is -1 no elements are added
            return -1;
        }
        else{
            int val = stack[top];  // store the top value in tempory variable
            stack[top] = -1;            // delete the top value
            top--;                    // reduce the count
            return val;               // return the top value with tempory variable
        }
    }
//    public int peek(){
//
//    }
    public void disply(){
        int si = top;          // start from the top element
        while(si >=0) {
            int k = stack[si--];    // top to down print
            System.out.println(k);
        }
    }
}
public class STACK_USING_ARRAY {
    static void main(String[] args) {
        stack kas = new stack();
        kas.push(8);
        kas.push(3);
        kas.push(2122);
        System.out.println(kas.pop());
        kas.disply();
    }
    
}
