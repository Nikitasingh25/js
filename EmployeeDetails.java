import java.util.*;

class Employee {
    String Name;
    long Id;
    float Salary;

    void salary(String name, long id, float sal) {
        Name = name;
        Id = id;
        Salary = sal;
        System.out.println("Employee informations are =");
        System.out.println("Name is " + Name);
        System.out.println("Id is " + Id);
        System.out.println("Salary before increment is " + Salary);
        Salary += 300;
        System.out.println("Salary after increment is " + Salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee obj = new Employee();
        System.out.print("Enter the name ");
        String name = input.next();
        System.out.print("Enter the Id ");
        long id = input.nextLong();
        System.out.print("Enter the Salary ");
        float sal = input.nextFloat();
        obj.salary(name, id, sal);
    }
}
