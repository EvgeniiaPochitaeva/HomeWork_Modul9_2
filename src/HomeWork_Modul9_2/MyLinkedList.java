package HomeWork_Modul9_2;

public class MyLinkedList {
    Node head;

    public MyLinkedList() {
        this.head = null;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void add(Object value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    } //додає елемент в кінець

    public void remove(int index) {

        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона.");
        }
        if (index == 0) {
            head = head.next;

        } else {
            Node previous = head;
            Node current = head.next;
            int currentIndex = 1;
            while (current != null && currentIndex < index) {
                previous = current;
                current = current.next;
                currentIndex++;
            }
            if (current != null) {
                previous.next = current.next;
            }
        }
    }       //видаляє елемент із вказаним індексом

    public Object get(int index) {
        Node current = head;
        int count = 0;

        while (count < index) {
            if (current.next == null) {
                throw new IndexOutOfBoundsException("Индекс вне диапазона.");
            }
            current = current.next;
            count++;
        }
        return current.data;
    }      //    повертає елемент за індексом
    public int size() {
        Node current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }      //повертає розмір колекції

public void clear() {
    head = null;
   }//очищає колекцію
}
class Node {
    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
}