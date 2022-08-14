package sliit.gayan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList numberList = new LinkedList();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< 10; i++){
            numberList.insertFirst(sc.nextInt());
            if(numberList.insertAfter(10,20) == true){
                numberList.displayList();
            }
        }

        Scanner del = new Scanner(System.in);
            if(numberList.deleteAfter(del.nextInt()) != null){
                numberList.displayList();
            }
    }
}