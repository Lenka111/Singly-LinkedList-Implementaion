//Elena Voinu
public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        //add the nodes to the linked list
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        //print the list
        list.printList();
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        System.out.println("Removed "+list.removeAtFront() + " from the list");
        list.printList();
        System.out.println(list.getSize());

    }
}
