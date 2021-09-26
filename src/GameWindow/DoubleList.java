package GameWindow;

/**
 * Class to create the doubly linked list
 * @author Justin Fern&aacute;ndez y Abraham Venegas
 * @version 1
 */
public class DoubleList {
    private Node head;
    private Node tail;
    private int size;

    /**
     * Constructor method without parameters
     */
    public DoubleList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * This method test if the list is empty or not.
     * @return False is the list is not empty or true if it is.
     */
    public boolean isEmpty() {
        return this.head == null;
    }

    /**
     * Returns the size of a list
     * @return size of the list
     */
    public int size() {
        return this.size;
    }

    /**
     * Insert a certain element at the end of the list
     * @param data the value to insert to the list
     */
    public void insertAtEnd(Object data){
        Node newNode = new Node(data);
        if (isEmpty()){
            this.head = newNode;
        }
        else if(this.size==1){
            newNode.prev = this.head;
            this.head.next = newNode;
        } else {
            newNode.prev = this.tail;
            this.tail.next =  newNode;
        }
        this.tail = newNode;
        this.size++;
    }

    /**
     * Deletes the first element of certain list
     * @return the first element of the list
     */
    public Node deleteFirst(){
        Node temp = this.head;
        if (this.head != null) {
            this.head = this.head.next;
            if (this.head != null) {
                this.head.prev = null;
            }
            this.size--;
            return temp;
        }
        return null;
    }

    /**
     * Returns the first element of the list without deletes it.
     * @return the head of a list
     */
    public Object getHead(){
        if (this.head != null){
            return this.head.data;
        }
        return null;
    }

    /**
     * Prints the list divided with one space for each element
     * @param list the list to print
     */
    public void printList(DoubleList list){
        System.out.println("\nCola: ");
        Node current = list.head;
        for(int i = 0;i < list.size();i++){
            Node actual = current;
            int intElement = (int) actual.data;
            System.out.print(intElement+" ");
            current = actual.next;}
    }

    /**
     * Moves the head to the front certain number of boxes
     * @param Campos the number of boxes to move
     */
    public void moveForward(int Campos){
        for (int j = 0; j < Campos; j++){
            Node current = this.head;
            if (current.next != null){
                this.head = current.next;
            }
        }
        System.out.println(this.head.data);
    }

    /**
     * Moves the head to the back certain number of boxes
     * @param Campos the number of boxes to move
     */
    public void moveBack(int Campos){
        for (int j = 0; j < Campos; j++){
            Node current = this.head;
            if (current.next != null){
                this.head = current.prev;
            }
        }
        System.out.println(this.head.data);
    }

    public static void main(String[] args) {
        DoubleList d = new DoubleList();

        for(int i =0; i<16;i++){
            d.insertAtEnd(i);
        }
        d.printList(d);
        System.out.println(d.head.data);
        d.moveForward(3);
        d.moveBack(2);
    }
}
