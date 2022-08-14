package sliit.gayan;

public class Main {
    public static void main(String[] args) {
        MyStack s = new MyStack(10);

        s.push(30);
        s.push(80);
        s.push(100);
        s.push(25);

        while (!s.isEmpty())
            System.out.println(s.pop());
    }
}