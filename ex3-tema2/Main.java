public class Main {
    public static void main(String[] args) {
        ListaInlantuitaS list = new ListaInlantuitaS();
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
        list.delete(6);
        list.printList();
    }
}





