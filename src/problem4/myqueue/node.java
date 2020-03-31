package problem4.myqueue;

public class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
        next = null;
    }

    public int getData() {

        return value;
    }

    public void setData(int value) {

        this.value = value;
    }

    public Node getNext() {

        return next;
    }

    public void setNext(Node next) {

        this.next = next;
    }
}
