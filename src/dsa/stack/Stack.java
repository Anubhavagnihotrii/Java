package dsa.stack;

public class Stack {
    int top=-1;
    int mazSize=5;
    int[]arr = new int[mazSize];

    void push(int ele){
        if(isFull()){
            System.out.println("stack overflow");
        }
        else {
            arr[++top] = ele;
        }
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
            return -1;
        }
        else {
            return top--;
        }
    }
    void display(){
        if(isEmpty()){
            System.out.println("stack is Empty.");
        }
        else {
            for (int i = top; i >=0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
    boolean isFull(){
        return top==mazSize-1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    public static void main(String[] args) {
        Stack stk  = new Stack();
        stk.push(10);stk.push(20);stk.push(30);
        stk.display();
        System.out.println("-------------------");
        stk.pop();
        stk.display();
        System.out.println("-------------------");
        stk.push(5);
        stk.display();
    }
}
