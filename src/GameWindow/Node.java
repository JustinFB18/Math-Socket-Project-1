package GameWindow;

/**
 * Class to create the nodes for a doubly linked list
 * @author Justin Fern&aacute;ndez y Abraham Venegas
 * @version 1
 */
public class Node {
    public Object data;
    public Node next;
    public Node prev;

    /**
     * Initialize the Node
     * @param data The data that is introduce in the Node
     */
    public Node(Object data) {
        this.next = null;
        this.prev = null;
        this.data = data;
    }

    /**
     * Return the data value
     * @return the data value of a Node
     */
    public Object getData() {
        return this.data;
    }

    /**
     * Set the data value
     * @param data value of the node
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * Return the next Node of certain Node
     * @return the next Node of a Node
     */
    public Node getNext() {
        return this.next;
    }

    /**
     * Return the previos Node of certain Node
     * @return the previous Node of a Node
     */
    public Node getPrev() {
        return this.prev;
    }

    /**
     * Set the next node of the current Node
     * @param node the next node
     */
    public void setNext(Node node) {
        this.next = node;
    }

    /**
     * Set the previous node of the current Node
     * @param node the previous node
     */
    public void setPrev(Node node) {
        this.prev = node;
    }
}
