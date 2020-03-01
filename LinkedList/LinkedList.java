package com.company;

class LinkedList {
    Node head;  // head of list

    /* Linked list Node*/
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Inserts a new node after the given prev_node. */
    public void insertAfter(Node prev_node, int new_data) {
        /* 1. Check if the given Node is null */
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

        /* 2 & 3: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;

        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
    }

    /* Appends a new node at the end.  This method is
       defined inside LinkedList class shown above */
    public void append(int new_data) {
        /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
        Node new_node = new Node(new_data);

        /* 4. If the Linked List is empty, then make the
              new node as head */
        if (head == null) {
            head = new Node(new_data);
            return;
        }

        /* 4. This new node is going to be the last node, so
              make next of it as null */
        new_node.next = null;

        /* 5. Else traverse till the last node */
        Node last = head;
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }


    public void deleteNode(int Key) {

        Node temp = head;
        Node prev = null;
        //If head Node it self holds the Head node to be Deleted

        //First Node
        if (temp != null && temp.data == Key) {
            head = temp.next;
            return;
        }
        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next


        while (temp != null && temp.data != Key) {
            //As we Loop we have to keep track of the Prev Node and set it as a temp
            prev = temp;
            temp = temp.next;
        }

        if (temp == null
        ) return;

        prev.next = temp.next;


    }

    public void deleteList() {
        head = null;

    }


    public int LengthLinkedList() {

        Node current = head;
        int count = 0;


        while (current != null) {
            current = current.next;
            count++;


        }

        return count;
    }


    public boolean searchkey(Node head, int x) {

        if (head == null)
            return false;
        if (head.data == x)
            return true;
        return searchkey(head.next, x);


    }


    //Write a function to get Nth node in a Linked List

    public int GetNth(int index) {
        Node current = head;
        int count = 0;

        while (current != null) {

            if (count == index)
                return current.data;
            count++;
            current = current.next;




        }
        assert (false);
        return 0;
    }


    /* This function prints contents of linked list starting from
        the given node */
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }

    }
}