public class Mainn {
    public static void main(String[] args) {
        ListaInlantuitaD list = new ListaInlantuitaD();
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.printList();

        list.delete(2);
        list.insert(6);
        list.printList();

        list.delete(1);
        list.delete(5);
        list.printList();
    }
}





