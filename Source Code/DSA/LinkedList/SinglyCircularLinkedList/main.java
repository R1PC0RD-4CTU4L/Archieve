public class main {

    public static void main(String[] args) {

        SinglyCircularLinkedList scll1 = new SinglyCircularLinkedList();
        scll1.createLinkedList("Susi");
        scll1.insertNodesAtLast("Fedora");
        scll1.insertNodesAtLast("Red Hat Linux");
        scll1.insertNodesAtFirst("Ubuntu");
        scll1.insertNodesAtFirst("Parrot OS");

        scll1.printList();

        scll1.insertNode("Kali Linux", 4);
        scll1.printList();

        /* Continuity Test */

        System.out.println(scll1.tail.value);
        System.out.println(scll1.tail.next.value);

        /* Deletion Test */
        scll1.deleteNode(4);
        scll1.printList();

        /* Continuity Test */

        System.out.println(scll1.tail.value);
        System.out.println(scll1.tail.next.value);

        System.out.println(scll1.searchNode("Red Hat Linux"));

    }

}
