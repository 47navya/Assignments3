import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}


class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

public class EMPManagement{
    public static void main(String[] args) {
        
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Alice", 50000));
        employeeList.add(new Employee(102, "Bob", 55000));
        employeeList.add(new Employee(103, "Charlie", 48000));
        Collections.sort(employeeList, new NameComparator());
        System.out.println("Sorted Employee List:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

    
        Set<Employee> employeeSet = new HashSet<>(employeeList);
        System.out.println("\nUnique Employees:");
        for (Employee emp : employeeSet) {
            System.out.println(emp);
        }

    
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for (Employee emp : employeeList) {
            employeeMap.put(emp.id, emp);
        }

        System.out.println("\nEmployee Map:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
