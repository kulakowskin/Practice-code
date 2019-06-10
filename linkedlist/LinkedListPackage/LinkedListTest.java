package LinkedListPackage;


public class LinkedListTest{
    private static LinkedList list;

    public static void main(String[] args){
        list = new LinkedList();

        list.addNode("He");
        list.addNode("ll");
        list.addNode("o ");
        list.addNode("Wo");
        list.addNode("rl");
        list.addNode("d!");

        System.out.println("The LinkedList:\t\t"+list.toString());
        // Remove by position
        System.out.println("Remove index 2:\t\t"+list.removeNode(2));
        System.out.println("The LinkedList:\t\t"+list.toString());

    }

}
