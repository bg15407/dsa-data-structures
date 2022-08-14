package digital.gayan.dsa;

import java.sql.Array;

public class CharacterStack {
    private int maxSize;
    private char [] characterStack;
    private int top;

    public CharacterStack(int size){
        this.maxSize = size;
        this.characterStack = new char[maxSize];
        this.top = -1;
    }

    public void push(char value){
        if(top == maxSize-1){
            System.out.println("Stack is full");
        }else {
            characterStack[++top] = value;
        }
    }

    public char pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return ' ';
        }else {
            return characterStack[top--];
        }
    }

    public char peak(){
        if(top==-1){
            System.out.println("Stack is empty");
            return ' ';
        }
        return characterStack[top];
    }

    public boolean isFull(){
        return top == maxSize-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}

