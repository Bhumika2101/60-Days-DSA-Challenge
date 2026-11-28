
public class StackUsingLinkedList {

    Node top;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

        System.out.println("Inserted at top: " + data);

    }

    void pop() {
        if (top == null) {

            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Removed: " + top.data);

        top = top.next;
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;

        }
        System.out.println("Top Element:" + top.data);

    }

    void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;
        while (temp != null) {
            System.out.println(top.data);
            temp = temp.next;
        }

    }

    public static void main(String args[]) {
        StackUsingLinkedList s = new StackUsingLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);

        s.pop();

        s.peek();

        s.display();

    }

}
