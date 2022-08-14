package sliit.gayan;

//create single Link object
public class Link {
    //instance variable should be public for Link
    public int iData; //data
    public Link next; // reference to the next link

    public Link(int value){
        this.iData = value;
        this.next = null;
    }

    public void displayLink(){
        System.out.println(this.iData);
    }
}
