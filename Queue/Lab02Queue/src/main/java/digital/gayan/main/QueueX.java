package digital.gayan.dsa;

public class QueueX {
    private int queueArray[];
    private int front;
    private int rear;
    private int maxSize;
    private int noOfItems;

    public QueueX(int size){
        this.maxSize = size;
        this.noOfItems = 0;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
    }

    //insert method
    public void insert(int value){
        if(rear == maxSize-1){
            System.out.println("Queue is full");
        }else {
            queueArray[++rear] = value;
            noOfItems++;
        }
    }

    //remove method
    public int remove(){
        if(noOfItems == 0){
            System.out.println("Queue is empty");
            return -99;
        }else{
            noOfItems--;
            return queueArray[front++];
        }
    }

    //isFull method
    public boolean isFull(){
        return rear == noOfItems-1;
    }

    //isEmpty method
    public boolean isEmpty(){
        return noOfItems == 0;
    }

    //display method
    public void display(){
        if(noOfItems==0){
            System.out.println("Queue is empty");
        }else{
            System.out.println(queueArray[front]);
        }

    }
}
