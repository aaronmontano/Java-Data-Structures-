public class Runner {

    public static void main(String[] args) {
        LinkedList listTest = new LinkedList(5);

        for (int i = 1; i <= 10; i++) {
            listTest.add(i);
        }
        listTest.printList();

        System.out.println("\nAdd first element. ");
        listTest.addFirst(432);
        listTest.printList();

        System.out.println("\nAdd last element. ");
        listTest.addLast(1111);
        listTest.printList();

        System.out.println("\nRemove first element. ");
        listTest.removeFirst();
        listTest.printList();

        System.out.println("\nRemove last element. ");
        listTest.removeLast();
        listTest.printList();
    }

}
