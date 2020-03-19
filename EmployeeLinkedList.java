// only works with Employee nodes
public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    //for best performance we should add items to the beginning of the list
    //so that we don't have to traverse the list looking for an insertion point

    //add to front of the list method.
    public void addToFront(Employee employee){
        // Employee instance(employee) that we want to add
        EmployeeNode node = new EmployeeNode(employee);
        //set the new node's next field.
        //will point to whatever the head is pointing to, because whenever we add a new node
        //to the front of the list, the current node in the list will become the second node, so
        //the new node will point to the current head
        node.setNext(head);
        //set head to the new node. The new node now becomes the head, points to the second element(ex-head)
        head = node;
        size++;

    }

    public int getSize() {
        return size;
    }

    public EmployeeNode removeAtFront(){
       //test if the list is empty
        if(isEmpty()){
            //nothing to remove
            return null;
        }
        //if list isn't empty
       // store the first node in the list in the variable removedNode
        EmployeeNode removedNode = head;
        //move the head to the next node
        //second item in the list becomes the head
        head=head.getNext();
        size--;
        removedNode.setNext(null);

        return removedNode;

    }
    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current!=null){
            System.out.print(current);
            System.out.print(" -> ");
            current=current.getNext();
        }
        System.out.print("NULL\n");
    }

    public boolean isEmpty(){
        return head == null;
    }

}
