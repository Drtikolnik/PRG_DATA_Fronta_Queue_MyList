

class Node {
    private Uchazec data; // uložená hodnota
    private Node next; // odkaz na další prvek v seznamu
    private Node prev; // odkaz na předchozí prvek v seznamu

    Node(Uchazec data) {
        this.data = data;
    }





    public Uchazec getData() {
        return data;
    }

    public void setData(Uchazec data) {
        this.data = data;
    }

    public Node getNext() { return next; }
    public void setNext(Node next) { this.next = next; }
    public Node getPrev() { return prev; }
    public void setPrev(Node prev) { this.prev = prev; }
}