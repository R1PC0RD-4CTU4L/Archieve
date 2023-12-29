public class SinglyLinkedList {

    Node head;
    Node tail;
    int sizeOfLinkedList;

    /*
     * Creation Of Linked List - createLinkedList(String value)
     * Input - String value for first Node
     * Returns - Reference of Head
     */

    public Node createLinkedList(String val) {

        Node newNode = new Node();
        newNode.value = val;
        newNode.next = null;
        head = newNode;
        tail = newNode;

        sizeOfLinkedList++;
        System.out.println("Linked List Is Created!");
        return head;

    }

    /*
     * Get Size Of Linked List -getSizeOfLL()
     * Input - Nothing
     * Returns - Size of Linked List
     */

    public int getSizeOfLL() {
        return sizeOfLinkedList;
    }

    /* Insertion Of Nodes */

    /*
     * 
     * 1.Insert Node At First
     * 2.Insert Node At Last
     * 3.Insert Node At Any Given Position
     */

    /*
     * Insertion Of Node At First - insertNodeAtFirst(String value)
     * 
     * Input-Node Value
     * Returns- Void
     */

    public void insertNodeAtFirst(String value) {

        // Case 1- If Linked List Doesnt Exist

        if (head == null) {
            createLinkedList(value);
            return;
        }
        // Case 2 - General Case
        else {

            Node newNode = new Node();
            newNode.value = value;
            newNode.next = head;
            head = newNode;
            sizeOfLinkedList++;
            System.out.println("Node Inserted At First!");

        }

    }

    /*
     * Insertion Of Node At Last - insertNodeAtLast(String value)
     * 
     * Input-Node Value
     * Returns- Void
     */

    public void insertNodeAtLast(String value) {

        // Case 1- If Linked List Doesnt Exist

        if (head == null) {
            createLinkedList(value);
            return;
        }
        // Case 2 - General Case
        else {

            Node newNode = new Node();
            newNode.value = value;

            Node tempNode = head;

            for (int i = 1; i < sizeOfLinkedList; i++) {
                tempNode = tempNode.next;
            }

            tempNode.next = newNode;
            newNode.next = null;
            tail = newNode;
            sizeOfLinkedList++;
            System.out.println("Node Inserted At Last!");

        }

    }

    /*
     * Insertion Of Node At Any Given Position -
     * insertNode(String value, int position)
     * 
     * Input-Node Value, Position
     * Returns- Void
     */
    public void insertNode(String value, int position) {

        // Case 1- If Linked List Doesnt Exist

        if (head == null) {
            createLinkedList(value);
            return;
        }

        // Case 2 - If Position is 1

        else if (position == 1) {
            insertNodeAtFirst(value);
            return;
        }
        // Case 3- If Position is Greater Than Size Of List
        else if (position > sizeOfLinkedList) {
            insertNodeAtLast(value);
        }
        // Case 4- If position is Negative or 0
        else if (position <= 0) {

            System.out.println("Invalid Positon. Try Again!");

        }

        // Case 5- General Case
        else {

            Node tempNode = head;

            for (int i = 1; i < position - 1; i++) {
                tempNode = tempNode.next;
            }

            Node newNode = new Node();
            newNode.value = value;

            Node nextNode = tempNode.next;
            tempNode.next = newNode;
            newNode.next = nextNode;
            sizeOfLinkedList++;
            System.out.println("Node Added At Position " + position);
        }
    }

    /*
     * Method- printList() - Prints the entire linked List
     * Input- Nothing
     * Returns - Void
     */

    public void printList() {
        Node tempNode = head;

        for (int i = 1; i <= sizeOfLinkedList; i++) {
            System.out.print(tempNode.value + " --> ");
            tempNode = tempNode.next;

        }

        System.out.print("NULL \n");

    }

    /* Deletion Of Nodes */

    /*
     * 
     * 1.Delete Node From First
     * 2.Delete Node From Last
     * 3.Delete Node From Any Given Position
     */

    /*
     * Deletion Of Node From First - deleteNodeFromFirst(String value)
     * 
     * Input-Nothing
     * Returns- Void
     */

    public void checkCornerCases() {
        // Case 1 - Linked List Doesnt Exist

        if (head == null) {
            System.out.println("Linked List Doesnt Exist! Nothing To Delete");
            return;
            // Case 2 - Only One Node Exists in Linked List
        } else if (head.next == null) {

            head = null;
            tail = null;
            sizeOfLinkedList--;

            System.out.println("Last Node Deleted! Nothing More To Delete ");
            return;
        }
    }

    public void deleteNodeFromFirst() {

        // Case 1 - Check Corner Cases

        checkCornerCases();
        // Case 2- General Case
        head = head.next;
        sizeOfLinkedList--;
        System.out.println("Node Deleted From First!");
    }

    /*
     * Deletion Of Node From Last - deleteNodeFromLast()
     * 
     * Input-Nothing
     * Returns- Void
     */

    public void deleteNodeFromLast() {

        // Case 1 - Check Corner Cases

        checkCornerCases();
        // Case 2- General Case

        Node tempNode = head;

        /* Using While Loop */
        // while(tempNode.next.next!=null)
        // {
        // tempNode=tempNode.next;
        // }

        /* Using For Loop */
        for (int i = 1; i < sizeOfLinkedList; i++) {
            tempNode = tempNode.next;
        }

        tempNode.next = null;
        sizeOfLinkedList--;
        tail = tempNode;
        System.out.println("Node Deleted From Last! ");
    }

    /*
     * Deletion Of Node From Any Given Position - deleteNode()
     * 
     * Input-Position
     * Returns- Void
     */

    public void deleteNode(int position) {

        // Case 1 - Check Corner Cases
        checkCornerCases();

        // Case 2- if position = 1

        if (position == 1) {
            deleteNodeFromFirst();

        }
        // Case 3- if position is greater than or equal to size of Linked List!
        else if (position >= sizeOfLinkedList) {
            deleteNodeFromLast();
        }
        // Case 4- if position = 0 or negative
        else if (position <= 0) {
            System.out.println("Invalid Position! 0 or Negatives Not accepted!  Try Again!");
        }
        // Case 5- General Case
        else {

            Node tempNode = head;

            for (int i = 1; i < position - 1; i++) {
                tempNode = tempNode.next;
            }

            Node toBeDeleted = tempNode.next;
            Node nextNode = toBeDeleted.next;

            tempNode.next = nextNode;
            sizeOfLinkedList--;
            System.out.println("Node Deleted From Position " + position);
        }

    }

    /*
     * Searching Of Node - searchNode(String Value)
     * 
     * Input-Value
     * Returns- Position Of Node
     */

    public int searchNode(String value) {
        Node tempNode = head;

        for (int i = 1; i <= sizeOfLinkedList; i++) {

            if (tempNode.value == value) {
                System.out.println("Value Found At Position " + i);
                return i;
            }
            tempNode = tempNode.next;
        }

        System.out.println("This Value Doesnt Exist In Linked List");
        return -1;

    }

    /*
     * Deletion Of Entire Linked List - deleteLinkedList()
     * 
     * Input-Nothing
     * Returns- Void
     */

    public void deleteLinkedList() {
        head = null;
        tail = null;
        sizeOfLinkedList = 0;
        System.out.println("Linked List Deleted!");
    }

}
