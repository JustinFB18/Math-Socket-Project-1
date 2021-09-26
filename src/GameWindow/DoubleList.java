package GameWindow;

public class DoubleList {
    private Node head;
    private Node tail;
    private int size;


    public DoubleList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    public boolean isEmpty() {
        return this.head == null;
    }


    public int size() {
        return this.size;
    }


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

    public Object getHead(){
        if (this.head != null){
            return this.head.data;
        }
        return null;
    }


    public void printList(DoubleList list){
        System.out.println("\nCola: ");
        Node current = list.head;
        for(int i = 0;i < list.size();i++){
            Node actual = current;
            int intElement = (int) actual.data;
            System.out.print(intElement+" ");
            current = actual.next;}
    }

    public void moveForward(int Campos){
        for (int j = 0; j < Campos; j++){
            Node current = this.head;
            if (current.next != null){
                this.head = current.next;
            }
        }
        System.out.println(this.head.data);
    }

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
