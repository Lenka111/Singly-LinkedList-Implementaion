//Elena Voinu
//Node class. Specific to the type we're using it with. 
//Will only work with employee instances(not generic)
public class EmployeeNode {
    
    //field for employee
    private  Employee employee;
    
    // stores the next field in the list
    private  EmployeeNode next;


    public String toString() {
        return employee.toString();
    }

    /*constructor only takes employee because when we construct an instance we don't know yet what the next node will be
    node is the element in the list
    if a node is the last node in the list then its next field will be set to null
    We don't have to set next to null in the constructor  because that is the default value for object fields*/
    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    //getters and setters
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }


}
