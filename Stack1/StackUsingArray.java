
public class StackUsingArray {
    int[] arr;
    int top;
    int size;

    StackUsingArray(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = data;

        System.out.println("Inserted: " + arr[top]);
    }

    void pop() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;

        }

        System.out.println("Removed: " + arr[top]);
        top--;

    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        }

        System.out.println("Top: " + arr[top]);
    }

    void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String args[]) {

        StackUsingArray s = new StackUsingArray(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.peek();

        s.pop();

        s.display();

    }

}
