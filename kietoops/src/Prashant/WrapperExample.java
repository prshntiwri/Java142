package Prashant;


public class WrapperExample {
    public static void main(String[] args) {
         final int a = 10;

        Integer num  = 23; // Integer num = new Integer(23);
        final int b = 39;//final keyword does not allow modifying
//        b = 30; //cannot be done

       final Employee E1 = new Employee("Rahul",100000);
        E1.name = "Ankit";//you can change the value of its reference variable
        System.out.println(E1.name);


//        E1 = new Prashant.Employee("Rohan", 20000); //This cannot be done you cannot change reference to that object ,when a non primitive is final you cannot reassine it

    }
}

class Employee{
    String name;
    int salary;


    //shortcut for creating constructor -> Alt+Insert


    public Employee(String name, int salary) {
        this.name = name;       //here this shows object reference
        this.salary = salary;
    }
}
