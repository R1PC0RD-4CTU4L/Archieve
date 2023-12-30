public class main {

    public static void main(String[] args) {

        /* Test 1 - Creating Linked list And Adding Nodes */
        SinglyLinkedList sll1 = new SinglyLinkedList();
        sll1.insertNodeAtFirst(12);
        sll1.insertNodeAtLast(15);
        sll1.insertNodeAtLast(26);
        sll1.insertNodeAtLast(34);
        sll1.insertNodeAtLast(11);
        sll1.insertNodeAtLast(53);

        sll1.printList();

        /* Test 2 -Continuity Test */

        System.out.println(sll1.tail.value);
        System.out.println(sll1.tail.next);

        /* Test 3 - Adding Nodes At Any Given Position */

        sll1.insertNode(45, 2);
        sll1.printList();

        /* Test 4- Deletion Of Nodes */

        sll1.insertNodeAtLast(56);
        sll1.insertNodeAtLast(13);
        sll1.insertNodeAtLast(93);

        sll1.printList();

        /* Test 4- Deletion Of Nodes From Last */
        sll1.deleteNodeFromLast();
        System.out.println(sll1.tail.value);
        sll1.printList();

        sll1.deleteNodeFromLast();
        System.out.println(sll1.tail.value);
        sll1.printList();

        /* Continuity Test */

        sll1.insertNodeAtLast(54);
        System.out.println(sll1.tail.value);
        sll1.printList();

        System.out.println(sll1.searchNode(54));

    }
}