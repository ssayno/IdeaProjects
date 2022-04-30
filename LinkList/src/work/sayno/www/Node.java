package work.sayno.www;

public class Node <E>{
    private E element;
    Node next;
    public Node(){}
    public Node(E element){
        this.setElement(element);
    }
    public Node(E element, Node next){
        this(element);
        this.setNext(next);
    }
    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
