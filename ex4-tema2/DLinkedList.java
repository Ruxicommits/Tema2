public class DLinkedList {
    DLinkedListNode head;
    DLinkedListNode tail;

    public void addNode(int data) {
        DLinkedListNode new_node = new DLinkedListNode(data);
        new_node.next = head;
        new_node.prev = null;
        if (head != null) {
            head.prev = new_node;
        } else {
            tail = new_node;
        }
        head = new_node;
        tail.next = head;
        head.prev = tail;
    }

    public void removeNode(int data) {
        DLinkedListNode current_node = head;
        if (current_node != null && current_node.data == data) {
            head = current_node.next;
            head.prev = tail;
            tail.next = head;
            return;
        }
        while (current_node != null && current_node.data != data) {
            current_node = current_node.next;
            if (current_node == null) {
                return;
            }
            current_node.prev.next = current_node.next;
            current_node.next.prev = current_node.prev;
        }
    }
}
