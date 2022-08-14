package sliit.gayan;

public class LinearQueue {
    private int [] queueArray;
    private int maxSize;
    private int front;
    private int rear;
    private int nItems; //if we decided to insert from some other location

    //  0 1 2 3
    // [10][][][]
    //

    public LinearQueue(int size){
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(int value){
        //check if the Q is full or not
        //increment rear by 1 & add the value
        if(rear == maxSize-1){
            System.out.println("Queue is full");
        }else{
            queueArray[++rear] = value;
            nItems++;
        }
    }

    public int remove(){
        //check if the q is empty or not
        //return the value in front & increment the front
        if(nItems == 0){
            System.out.println("Queue is empty");
            return -99;
        }else {
            nItems--;
            return queueArray[front++];
        }
    }

    public int peak(){
        //check if the Q is empty or not
        //return the value in the fornt
        if(nItems == 0){
            System.out.println("Queue is empty");
            return -99;
        }else{
            return queueArray[front];
        }
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    public boolean isFull(){
        return rear == maxSize-1;
    }
}
