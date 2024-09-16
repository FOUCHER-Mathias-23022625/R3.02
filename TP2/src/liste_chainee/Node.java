package liste_chainee;

public class Node {
    private int element;
    private Node next;

    public Node(int element) {
        this.element = element;
        this.next = null;
    }

    public int getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
