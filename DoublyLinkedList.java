package dsa.linkedlist;

public class DoublyLinkedList {

    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    // INSERT at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }

        System.out.println("Inserted: " + data);
    }

    // DISPLAY list
    public void display() {
        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // MAIN method
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(5);
        list.insert(15);
        list.insert(25);
        list.display();
    }
}
