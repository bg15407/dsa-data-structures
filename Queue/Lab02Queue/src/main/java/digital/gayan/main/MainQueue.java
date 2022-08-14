package digital.gayan.dsa;

import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {
         QueueX printerQueue = new QueueX(5);
         QueueX evenQ = new QueueX(5);
         QueueX oddQ = new QueueX(5);

         Scanner input = new Scanner(System.in);
         for(int i = 0; i < 5; i++){
             System.out.print("Enter transaction ID " + i + ": ");
             printerQueue.insert(input.nextInt());
         }

        int temp;
        while(!printerQueue.isEmpty()){
            temp = printerQueue.remove();
            if(temp % 2 == 0){
                evenQ.insert(temp);
            }else{
                oddQ.insert(temp);
            }
        }
        System.out.println("PC1");
        while (!evenQ.isEmpty()) {
            System.out.println(" " + evenQ.remove());
        }

        System.out.println("PC2");
        while(!oddQ.isEmpty()){
            System.out.println(" " + oddQ.remove());
        }


    }
}