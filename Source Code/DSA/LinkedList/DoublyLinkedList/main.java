public class main {

    public static void main(String[] args) {

        DoublyLinkedList dll1 = new DoublyLinkedList();
        dll1.createLinkedList("Howrah");
        dll1.insertNodeAtLast("Liluah");
        dll1.insertNodeAtLast("Belur");
        dll1.insertNodeAtLast("Bally");
        dll1.insertNodeAtLast("Uttarpara");
        dll1.insertNodeAtLast("Hindmotor");
        dll1.insertNodeAtLast("Konnagar");

        dll1.printList();

    }
}