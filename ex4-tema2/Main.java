public class Main {

        public static void main(String[] args) {
            DLinkedList list = new DLinkedList();

            list.addNode(5);
            list.addNode(10);
            list.addNode(15);
            list.addNode(20);
            list.addNode(25);

            list.removeNode(10);
            list.addNode(30);

            DLinkedListNode current_node = list.head;
            do {
                System.out.print(current_node.data + " ");
                current_node = current_node.next;
            } while (current_node != list.head);
        }
    }

