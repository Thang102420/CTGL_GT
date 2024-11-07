public class MyLinkedListQueue implements IStackQueue {

    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // Two main operations: Add elements at the end (push) and remove from the front (pop)
    Node headNode;
    Node tailNode;

    MyLinkedListQueue() {
        headNode = tailNode = null;
    }

    @Override
    public boolean push(int value) {
        if (isFull()) {
            return false;
        }

        Node newNode = new Node(value);
        if (isEmpty()) {
            headNode = tailNode = newNode;
        } else {
            // Add the new node to the end of the linked list
            tailNode.next = newNode;
            tailNode = newNode;
        }
        return true;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        int value = headNode.value;
        // If there is only one node in the list
        if (headNode == tailNode) {
            headNode = tailNode = null;
        } else {
            headNode = headNode.next;
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (headNode == null && tailNode == null);
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }

        Node curNode = headNode;
        while (curNode != null) {
            System.out.print(curNode.value + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }
}
