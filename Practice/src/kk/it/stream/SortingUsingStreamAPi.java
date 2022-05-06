package kk.it.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class DriverClass{
       public static void main(String[] args) {
           List<Employee> list = new ArrayList<Employee>(){{
               add(new Employee("kamlesh", 5000));
               add(new Employee("mahesh", 1000));
               add(new Employee("dinesh", 2000));
               add(new Employee("ritesh", 100));
           }};
           List<Employee> sortedList = new ArrayList<>();
//           Comparator<Employee> nameComparator = Comparator.comparing(Employee::getSalary);
//           sortedList = list.stream().sorted(nameComparator).collect(Collectors.toList());
//           System.out.println("===>>>"+sortedList);

           //Descending Order
//           Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);
//           sortedList = list.stream().sorted(nameComparator.reversed()).collect(Collectors.toList());
//           System.out.println("===>>>"+sortedList);

           //find the employee who have highest salary
           Comparator<Employee> nameComparator = Comparator.comparing(Employee::getSalary);
           Optional<Employee> employee = list.stream().max(nameComparator).stream().findFirst();
           System.out.println("===>>>"+employee);


       }
   }