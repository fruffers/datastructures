package hashTable_LinkedList;

public class HashTable {
    int size;
    // 2D array allows seperate chaining to handle collisions
    // but we have use linkedlist instead of arrays in arrays
    LinkedList buckets[];

    HashTable(int size) {
        this.size = size;
        this.buckets = new LinkedList[this.size];

        // use linked list with pointers because it's easier to insert things
        // in middle without shifting memory somewhere new
        for (int i=0; i<this.size; i++) {
            this.buckets[i] = new LinkedList();
        }
    }
    // takes input and gives same output every time. Usually an index
    // output that maps to index so value stored in there
    public int hashFunction(String key) {
        // put key through hash to get a unique index val

        // checksum
        int hashResult = 0;
        for (int i = 0; i < key.length(); i++) {
            hashResult = Character.codePointAt(key,i);
        }
        return hashResult % this.size;
    }
    public void insert(String key, String value) {
        int index = hashFunction(key);
        this.buckets[index].append(value);
    }
    public void delete(String key) {
        int index = hashFunction(key);

        System.out.print("delete: ");
        this.buckets[index].printList();

        this.buckets[index] = null;
    }
    // prevent collisions where two data values are put in the same bucket
    // thus the hash function has given duplicate output for min 2 keys
    public void linearProbing() {
    }
    // O(1) because we use hash func with key to get index then access directly
    public LinkedList find(String key) {
        int index = hashFunction(key);
        System.out.print("Found: ");
        this.buckets[index].printList();

        return this.buckets[index];
    }
}
