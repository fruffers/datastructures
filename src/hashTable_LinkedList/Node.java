package hashTable_LinkedList;
// Java does not have pointers
public class Node {
    String value;
    Node prev;
    Node next;
    Node(String value, Node prev, Node next) {
        this.value = value;
        this.prev = prev;
        this.next = next;

    }
    Node(String value) {
        this(value, null, null);
    }
}
