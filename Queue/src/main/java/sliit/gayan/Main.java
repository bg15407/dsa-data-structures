package sliit.gayan;

public class Main {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(10);

        circularQueue.insert(10);
        circularQueue.insert(25);
        circularQueue.insert(55);
        circularQueue.insert(65);
        circularQueue.insert(85);

        while (!circularQueue.isEmpty()){
            System.out.println(circularQueue.remove());
        }
    }
}