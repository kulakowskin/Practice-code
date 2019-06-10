package LinkedListPackage;

class Node{
    Node next = null;
    String value = null;
}

public class LinkedList{
    Node head = null;

    public void addNode(String value){
        Node temp = new Node();
        if (this.head == null){
            this.head = new Node();
            head.value = value;
        }
        else{
            temp = this.head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node();
            temp.next.value = value;
        }
    }

    public boolean removeNode(int index){
        Node temp = head;
        for (int i = 0; i < index; i++){
            if(temp.next != null){
                temp = temp.next;
            }else{
                // index does not exist in LinkedList
                return false;
            }
        }
        if(temp.next != null){
            // temp should now be predecessor of node to remove
            // Just remove ref to node and replace with its next node
            temp.next = temp.next.next;
            temp.next.value = temp.next.next.value;
            return true;
        }
        return false;
    }

    public String toString(){
        Node temp = new Node();
        temp = head;
        String listStr = "";
        while(temp.next != null){
            // If statement is for a pretty output separated by commas
            if (listStr.equals("")){
                listStr = temp.value;
            }
            else{
                listStr += ", " + temp.value;
            }
            temp = temp.next;
        }
        return listStr;
    }

}
