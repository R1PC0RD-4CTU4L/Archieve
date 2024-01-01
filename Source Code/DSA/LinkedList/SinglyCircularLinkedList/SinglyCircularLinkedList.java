public class SinglyCircularLinkedList {

    Node head;
    Node tail;
    int sizeOfLinkedList;

    /* createLinkedList() - Creates a Linked List */

    public Node createLinkedList(String value) {

        Node newNode = new Node();
        newNode.value = value;
        head = newNode;
        tail = newNode;
        tail.next = head;
        sizeOfLinkedList++;
        System.out.println("Linked List Successfully Created!");

        return head;

    }

    /* Insertion Of Nodes */

    /*
     * Insert Nodes At Beginnning
     * Insert Nodes At End
     * Insert Nodes At Any Given Position
     */

    /* insertNodesAtFirst() - Insert Nodes At Beginning */

    public void insertNodesAtFirst(String value) {
        /* If Linked List Is Not Created */

        if (head == null) {
            createLinkedList(value);
            return;
        } else {

            Node newNode = new Node();
            newNode.value = value;

            newNode.next = head;
            head = newNode;
            tail.next = head;
            sizeOfLinkedList++;
            System.out.println("Node inserted at First!");

        }
    }

    /* insertNodesAtLast(String value) - Insert Nodes At End */
    public void insertNodesAtLast(String value) {

        /* If Linked List Is Not Created */
        if (head == null) {
            createLinkedList(value);
            return;
        } else {

            Node newNode = new Node();
            newNode.value = value;

            tail.next = newNode;
            tail = newNode;
            tail.next = head;
            sizeOfLinkedList++;
            System.out.println("Node Inserted At Last");

        }
    }

    /* insertNode(String value,int position ) */

    public void insertNode(String value, int position) {

        /* If Linked List Is Not Created */

        if (head == null) {
            createLinkedList(value);
            return;

        }
        /* If position is 1.Insert at first */
        else if (position == 1) {
            insertNodesAtFirst(value);

        }
        /* If position is greater than size of linked list, insert at last */
        else if (position > sizeOfLinkedList) {
            insertNodesAtLast(value);
        }
        /* If position is negative or 0, invalid insertion */
        else if (position <= 0) {
            System.out.println("Invalid Position. 0 and negatives are not allowed");

        }
        /* General Case */
        else {

            Node tempNode = head;

            for (int i = 1; i < position - 1; i++) {
                tempNode = tempNode.next;
            }

            Node nextNode = tempNode.next;
            Node toBeInserted = new Node();
            toBeInserted.value = value;
            toBeInserted.next = nextNode;
            tempNode.next = toBeInserted;
            sizeOfLinkedList++;
            System.out.println("Node Added At Position " + position);

        }

    }

    /* printList() -Prints the linked list */

    public void printList() {
        Node tempNode = head;

        for (int i = 1; i <= sizeOfLinkedList; i++) {
            System.out.print(tempNode.value + " --> ");
            tempNode = tempNode.next;
        }

        System.out.print("HEAD \n");
    }

    /* Delete Nodes */

    /* deleteNodeFromFirst() - Deletes Node From Beginning Of THe List */

    public void deleteNodeFromFirst() {
        /* If Linked List Is Not Created */

        if (head == null) {
            System.out.println("Linked List Doesnt Exist! Nothing To Delete");

        }

        /* If Linked List has only one node */

        else if (sizeOfLinkedList == 1) {
            head = null;
            tail = null;
            sizeOfLinkedList--;
            System.out.println("Last Node Deleted! Nothing To Delete!");
        }
        /* General Case */
        else {

            head = head.next;
            tail.next = head;
            sizeOfLinkedList--;
            System.out.println("Node deleted From First!");

        }

    }

    /* deleteNodeFromLast() - Deletes Node From End Of THe List */

    public void deleteNodeFromLast() {

        /* If Linked List Is Not Created */

        if (head == null) {
            System.out.println("Linked List Doesnt Exist! Nothing To Delete");

        }

        /* If Linked List has only one node */

        else if (sizeOfLinkedList == 1) {
            head = null;
            tail = null;
            sizeOfLinkedList--;
            System.out.println("Last Node Deleted! Nothing To Delete!");
        }

        else {

            Node secondLastNode = head;

            for (int i = 1; i < sizeOfLinkedList - 1; i++) {

                secondLastNode = secondLastNode.next;

            }

            secondLastNode.next = head;
            tail = secondLastNode;
            sizeOfLinkedList--;
            System.out.println("Node Deleted From Last!");

        }
    }

    public void deleteNode(int position) {

        /* If Linked List Is Not Created */

        if (head == null) {
            System.out.println("Linked List Doesnt Exist! Nothing To Delete");

        }

        /* If Linked List has only one node */

        else if (sizeOfLinkedList == 1) {
            head = null;
            tail = null;
            sizeOfLinkedList--;
            System.out.println("Last Node Deleted! Nothing To Delete!");
        }

        /* If position = 1, Delete From First */

        else if (position == 1) {
            deleteNodeFromFirst();
        }

        /* If position >=sizeOfLinkedList, Delete From Last */
        else if (position >= sizeOfLinkedList) {
            deleteNodeFromLast();
        }

        /* If position ,=0, invalid operation */

        else if (position <= 0) {
            System.out.println("Invalid Option! 0s and negatives not accepted!");
        } else {

            Node tempNode = head;
            for (int i = 1; i < position - 1; i++) {
                tempNode = tempNode.next;
            }

            Node toBeDeleted = tempNode.next;
            Node nextNode = tempNode.next.next;

            tempNode.next = nextNode;
            sizeOfLinkedList--;
            System.out.println("Node Deleted From Position " + position);
        }

    }

    /*
     * searchNode(int val)- Searching Of Nodes. Returns position of node if present.
     * Else returns -1
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
        System.out.println("Value Not Found In Linked List! ");
        return -1;
    }

    /* deleteLinkedList() - Deletes the entire linked list */

    public void deleteLinkedList() {
        head = null;
        tail = null;
        sizeOfLinkedList = 0;
        System.out.println("Linked List Deleted!");
    }

}
