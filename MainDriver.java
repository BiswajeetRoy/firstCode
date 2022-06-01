import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainDriver{
    public static void main(String[] args) {
        
        List<Employee> employees =new ArrayList<>();

        Employee e1 = new Employee("Shubham", 21,25000);
        Employee e2 = new Employee("Biswajeet", 24, 28000);
        Employee e3 = new Employee("Anupam", 28, 20000);
        Employee e4 = new Employee("Sanjib", 25, 25000);
        Employee e5 = new Employee("Mumma", 29, 25000);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        System.out.println("Original Salary = "+ employees);


        List<Employee> incrementedSalary = employees.stream().map(p -> {
           if(p.getAge() > 25){
               p.setSalary(p.getSalary() * 1.10);
           } 
           return p;
        }).collect(Collectors.toList());

        System.out.println("Incremented Salary = "+ incrementedSalary);
    }
}