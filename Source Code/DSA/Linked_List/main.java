import SinglyLinkedList.SinglyLinkedList;

public class main {

    public static void main(String[] args) {

        /* Test 1 - Creating A Singly Linked List And Printing It */

        SinglyLinkedList sll1 = new SinglyLinkedList();
        sll1.createLinkedList("Bandel");
        sll1.printList();

        /*
         * Test 2 - Inserting A Node using insertNodeAtFirst() Method at the beginning
         * And Printing It
         */
        sll1.insertNodeAtFirst("Seoraphully");
        sll1.insertNodeAtFirst("Howrah");
        sll1.printList();

        /*
         * Test 3 - Inserting A Node using insertNodeAtFirst() Method when there is no
         * Linked List
         */

        SinglyLinkedList sll2 = new SinglyLinkedList();
        sll2.insertNodeAtFirst("Dasnagar");
        sll2.insertNodeAtFirst("Tikiapara");
        sll2.printList();

        /*
         * Test 4 - Inserting A Node using insertNodeAtLast() Method
         */

        sll1.insertNodeAtLast("Bardhaman");
        sll2.insertNodeAtLast("Santragachi");
        sll1.printList();
        sll2.printList();

        /*
         * Test 5 - Inserting A Node using insertNodeAtLast() Method when there is no
         * Linked List
         */

        SinglyLinkedList sll3 = new SinglyLinkedList();
        sll3.insertNodeAtLast("Rampurhat");
        sll3.insertNodeAtLast("New Farakka");
        sll3.printList();

        /*
         * Test 6 - Inserting A Node using insertNode() Method when there is no
         * Linked List
         */

        SinglyLinkedList sll4 = new SinglyLinkedList();
        sll4.insertNode("New Jalpaiguri", 1);
        sll4.printList();

        /*
         * Test 7 - Inserting A Node using insertNode() Method at any given index when
         * there is already an existing linked list
         */

        sll2.insertNode("Ramrajatala", 3);
        sll1.insertNode("Chandannagar", 3);
        sll3.insertNode("Nalhati", 2);

        sll2.printList();
        sll1.printList();
        sll3.printList();

        /*
         * Test 8 - Inserting A Node using insertNode() Method at an index which is
         * greater than the size of when
         * there is already an existing linked list
         */

        sll4.insertNode("Jalpaiguri Road", 10);
        sll4.insertNode("Raninagar Jalpaiguri", 2);
        sll4.printList();

    }

}
