package sliit.gayan;

//collection of Links
public class LinkedList {
    private Link first;

    public LinkedList(){
      this.first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    //print multiple links
    public void displayList(){
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
    }

    //find can return boolean or Link type
    public boolean find(int key){
        Link current = first;
        while(current != null){
            if (current.iData == key){
                return true;
            }else{
                current = current.next;
            }
        }
        return false;
    }

    public Link findLink(int key){
        Link current = first;
        while(current != null){
            if (current.iData == key){
                return current;
            }else{
                current = current.next;
            }
        }
        return null;
    }

    //insert first or insert to a middle of two link
    public void insertFirst(int value) {
        //1.create a Link with the value
        Link newLink = new Link(value);

        //2.insert (adding two connections)
        //first implement the right connection & then implement the left connection
        newLink.next = first;
        first = newLink;
    }

    //inserting after the key value
    public boolean insertAfter(int key, int value){
        //1. creat a Link with the new value
        Link newLink = new Link(value);

        //2.Find the key Link
        Link current = first;
        while (current != null){
            if(current.iData == key){
                //add the new data (first right connection & then left)
                newLink.next = current.next;
                current.next = newLink;
                return true;
            }else{
                current = current.next;
            }
        }
        return false;
    }

    //delete first or in the middle
    public Link deleteFirst(){
        Link deletedLink = first;
        first = first.next; //deletedLink.next also ok
        return deletedLink;
    }

    //delete from middle of the linked list
    public Link deleteAfter(int key){
        Link current = first;
        Link previous = first;

        while(current != null){
            if(current.iData == key){
                if(current == first){//if the key is first then call the deleteFirst
                    Link temp = first;
                    first = first.next;
                    return temp; //can return true for boolean
                }else{
                    previous.next = current.next;
                    return current; //can return true for boolean
                }
            }else{
                previous = current;
                current = current.next;
            }
        }
        return null;//can return false for boolean
    }
}

