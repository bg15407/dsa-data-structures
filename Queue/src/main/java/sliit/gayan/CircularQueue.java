package sliit.gayan;

public class CircularQueue {
    private int [] queueArray;
    private int maxSize;
    private int front;
    private int rear;
    private int nItems; //if we decided to insert from some other location

    //  0 1 2 3
    // [10][][][]
    //

    public CircularQueue(int size){
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(int value){
        //check if the Q is full or not
        //increment rear by 1 & add the value
        //check if the Q is full for circular queue
        if(nItems == maxSize){
            System.out.println("Queue is full");
        } else{
            if(rear == maxSize-1) {
                rear = -1;
            }
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
            int temp = queueArray[front++];
            if(front == maxSize){
                front = 0;
            }
            return temp;
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
        return nItems == maxSize;
    }
}
