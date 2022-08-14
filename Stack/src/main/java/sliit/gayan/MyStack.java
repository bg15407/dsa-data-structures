package sliit.gayan;

public class MyStack {

    private int maxSize;
    private double [] stackArray;
    private int top;

    public MyStack(int size){
        this.maxSize = size;
        this.stackArray = new double[maxSize];
        this.top = -1;
    }

    public void push(double value){
        if(top == maxSize-1)
            System.out.println("Stack is full");
        else
            stackArray[++top] = value;
    }

    public double peak(){
        if(top == -1) {
            System.out.println("Empty Stack");
            return -99;
        }
        else
            return stackArray[top];
    }

    public double pop(){
        if (top == -1) {
            System.out.println("Empty Stack");
            return -99;
        }
        else
            return stackArray[top--];
    }

    public boolean isFull(){
        return (top == maxSize -1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }
}
