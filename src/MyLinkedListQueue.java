public class MyLinkedListQueue extends Node {
    private Node head;
    private Node tail;

    public MyLinkedListQueue(int key) {
        super(key);
        this.head = null;
        this.tail = null;
    }

    public Node dequeue() {
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return temp;
    }
}
