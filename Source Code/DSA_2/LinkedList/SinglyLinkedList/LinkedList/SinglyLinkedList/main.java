
public class main {

    public static void main(String[] args) {

        /*
         * Test 1 - Creating A Linked List And Using insertNodeAtFirst() And
         * insertNodeAtLast() Functions
         */

        System.out.println("Sentinels");

        SinglyLinkedList sll1 = new SinglyLinkedList();
        sll1.createLinkedList("Cypher");
        sll1.insertNodeAtFirst("Deadlock");
        sll1.insertNodeAtFirst("KillJoy");
        sll1.insertNodeAtLast("Sage");
        sll1.insertNodeAtLast("Chamber");
        sll1.printList();

        /*
         * Test 2 - Creating A Linked List Using insertNodeAtFirst() And
         * insertNodeAtLast() Functions without createLinkedList() Functions
         */
        System.out.println("Controllers");

        SinglyLinkedList sll2 = new SinglyLinkedList();
        sll2.insertNodeAtFirst("Omen");
        sll2.insertNodeAtFirst("Viper");
        sll2.insertNodeAtFirst("Brimstone");
        sll2.printList();

        /*
         * Test 3 - Inserting Node At Any Given Index
         */

        sll2.insertNode("Harbor", 2);
        sll2.insertNode("Astra", 4);
        sll2.printList();

        /* Testing Deletions */

        SinglyLinkedList sll3 = new SinglyLinkedList();
        sll3.insertNodeAtLast("Gekko");
        sll3.insertNodeAtLast("Fade");
        sll3.insertNodeAtLast("Sova");
        sll3.insertNodeAtLast("Breach");
        sll3.insertNodeAtLast("Yoru");
        sll3.insertNodeAtLast("Reyna");
        sll3.insertNodeAtLast("Sage");
        sll3.insertNodeAtLast("Jett");
        sll3.insertNodeAtLast("Phoenix");
        sll3.insertNodeAtLast("Killjoy");
        sll3.insertNodeAtLast("Cypher");
        sll3.insertNodeAtLast("Astra");
        sll3.insertNodeAtLast("Iso");
        sll3.insertNodeAtLast("Raze");
        sll3.insertNodeAtLast("Skye");
        sll3.insertNodeAtLast("Harbor");
        sll3.insertNode("Deadlock", 6);
        sll3.insertNode("Brimstone", 3);
        sll3.insertNode("Viper", 5);
        sll3.insertNode("Omen", 7);

        sll3.printList();

        /* Test 1 - Delete From First! */

        sll3.deleteNodeFromFirst();
        sll3.printList();

        /* Test 2 - Delete From Last! */
        sll3.deleteNodeFromLast();
        sll3.printList();

        /* Test 3 - Delete Node From Any Given Position */
        sll3.deleteNode(2);
        sll3.printList();
        sll3.deleteNode(1);
        sll3.printList();
        sll3.deleteNode(sll3.getSizeOfLL() - 1);
        sll3.printList();

        sll3.deleteNode(sll3.getSizeOfLL());
        sll3.printList();

        /* Testing Searching! */
        System.out.println(sll3.searchNode("Deadlock"));
        System.out.println(sll3.searchNode("Raze"));
        System.out.println(sll3.searchNode("Iso"));
        System.out.println(sll3.searchNode("Sova"));
        System.out.println(sll3.searchNode("Viper"));

        /* Testing Deletion Of Entire Linked List! */
        sll3.deleteLinkedList();
        sll3.printList();

    }

}
