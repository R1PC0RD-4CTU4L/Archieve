public class DoublyLinkedList {

    Node head;
    Node tail;
    int sizeOfLinkedList;

    public Node createLinkedList(String value) {
        Node newNode = new Node();
        newNode.value = value;

        head = newNode;
        tail = newNode;
        tail.next = null;
        sizeOfLinkedList++;

        System.out.println("Linked List Created!");
        return head;

    }

    /*
     * Inserting Nodes
     * 
     * 1.insertNodeAtFirst()
     * 2.insertNodeAtLast()
     * 3.insertNode()
     */

    /* insertNodeAtFirst(String value) */

    public void insertNodeAtFirst(String value) {

        /* Case 1- If linked list doesnt exist */

        if (head == null) {
            createLinkedList(value);
            return;
        }
        /* General Case */
        else {

            Node newNode = new Node();
            newNode.value = value;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            sizeOfLinkedList++;
            System.out.println("New node added at First!");
        }

    }

    /* insertNodeAtLast(String value) */

    public void insertNodeAtLast(String value) {

        /* Case 1- If linked list doesnt exist */

        if (head == null) {
            createLinkedList(value);
            return;
        }
        /* General Case */
        else {

            Node newNode = new Node();
            newNode.value = value;

            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = null;
            tail = newNode;

            sizeOfLinkedList++;
            System.out.println("Node Added At Last!");
        }
    }

    /* insertNode(String value,int position) */

    public void insertNode(String value, int position) {

        /* Case 1- If linked list doesnt exist */

        if (head == null) {
            createLinkedList(value);

            return;

        }
        /* If position =1 , i.e insertion at first position */
        else if (position == 1) {

            insertNodeAtFirst(value);
        }
        /* If position >=sizeOfLinkedList , i.e insertion at last position */
        else if (position >= sizeOfLinkedList) {
            insertNodeAtLast(value);
        } else if (position <= 0) {
            System.out.println("Negative Values And 0 not accepted!");
        }

        /* General Case */
        else {

            Node newNode = new Node();
            newNode.value = value;

            Node tempNode = head;

            for (int i = 1; i < position - 1; i++) {
                tempNode = tempNode.next;

            }

            Node nextNode = tempNode.next;
            tempNode.next = newNode;
            newNode.prev = tempNode;
            newNode.next = nextNode;
            nextNode.prev = newNode;
            sizeOfLinkedList++;
            System.out.println("Node inserted at position " + position);

        }

    }

    /* printList() - prints the entire linked list */

    public void printList() {
        Node tempNode = head;

        for (int i = 1; i <= sizeOfLinkedList; i++) {

            if (i == sizeOfLinkedList) {
                System.out.print(tempNode.value + " --> ");
                continue;
            }
            System.out.print(tempNode.value + " <--> ");
            tempNode = tempNode.next;
        }
        System.out.print("NULL \n");
    }

    /*
     * Deleting Nodes
     * 
     * 1.deleteNodeFromFirst()
     * 2.deleteNodeFromLast()
     * 3.deleteNode()
     */

    /*
     * deleteNodeFromFirst() - Deletes a node from the beginning of the linked list
     */

    public void deleteNodeFromFirst() {

        /* If Linked List Doesnt Exist */
        if (head == null) {
            System.out.println("Nothing To Delete!");
        }
        /* If only one node exists */
        else if (sizeOfLinkedList == 1) {

            head = null;
            tail = null;
            sizeOfLinkedList--;
            System.out.println("Last Node Deleted! Nothing Else To Delete!");

        }

        /* General Case */
        else {
            head = head.next;
            sizeOfLinkedList--;
            System.out.println("Deleted Node From First");

        }
    }

    /*
     * deleteNodeFromLast() - Deletes a node from the end of the linked list
     */

    public void deleteFromLast() {
        /* If Linked List Doesnt Exist */
        if (head == null) {
            System.out.println("Nothing To Delete!");
        }
        /* If only one node exists */
        else if (sizeOfLinkedList == 1) {

            head = null;
            tail = null;
            sizeOfLinkedList--;
            System.out.println("Last Node Deleted! Nothing Else To Delete!");

        }
        /* General Case */
        else {
            Node secondLastNode = tail.prev;
            secondLastNode.next = null;
            tail = secondLastNode;
            sizeOfLinkedList--;
            System.out.println("Last Node Deleted!");

        }
    }

    public void deleteNode(String value, int node) {

          /* If Linked List Doesnt Exist */
        if (head == null) {
            System.out.println("Nothing To Delete!");
        }
        /* If only one node exists */
        else if (sizeOfLinkedList == 1) {

            head = null;
            tail = null;
            sizeOfLinkedList--;
            System.out.println("Last Node Deleted! Nothing Else To Delete!");

        }
        else if(sizeOfLinkedList==1)

    }

}
