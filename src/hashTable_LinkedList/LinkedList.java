package hashTable_LinkedList;
/*
Made up of nodes that have pointer to next and prev nodes.
Has head and tail (all trailing nodes).
Mem locations are random and only linked through pointers.
Meaning that insertion and deletion is easy.
But have to traverse through start to desired node when searching.
*/
public class LinkedList {
    Node head;
    Node tail;
    LinkedList() {
        this.head = this.tail = null;
    }

    // add to the end
    public void append(String value) {
        // if list has no tail
        if (this.tail == null) {
            this.head = this.tail = new Node(value);
        }
        else {
            Node oldTail = this.tail;
            this.tail = new Node(value);
            oldTail.next = this.tail;
            this.tail.prev = oldTail;
        }
    }

    // set new head
    void prepend(String value) {
        // if list empty
        if (this.head == null) {
            this.head = this.tail = new Node(value);
        }
        else {
            Node oldHead = this.head;
            this.head = new Node(value);
            oldHead.prev = this.head;
            this.head.next = oldHead;
        }
    }

    String deleteHead() {
        if (this.head == null) {
            return null;
        }
        else {
            Node removedHead = this.head;
            if (this.head == this.tail) {
                this.head = this.tail = null;
            }
            this.head = this.head.next;
            this.head.prev = null;

            return removedHead.value;
        }
    }

    // delete one node off the end of tail
    String deleteTail() {
        if (this.tail == null) {
            return null;
        }
        else {
            Node removeTail = this.tail;
            if (this.head == this.tail) {
                this.head = this.tail = null;
            }
            this.tail = this.tail.prev;
            this.tail.next = null;

            return removeTail.value;
        }
    }

    void deleteTailingNode() {

    }

    Node search(String value) {
        Node currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.value == value ) {
                return currentNode;
            }
            else {
                currentNode = currentNode.next;
            }
        }
        return null;
    }

    void printList() {
        Node currentNode = this.head;
        while (currentNode != null) {
            System.out.print(currentNode.value);
            currentNode = currentNode.next;
        }
    }

}
