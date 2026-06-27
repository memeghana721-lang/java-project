import com.meghana.assignment.employees.Manager;
import com.meghana.assignment.employees.Developer;
import com.meghana.assignment.utilities.EmployeeUtilities;

/**
 * Main class to execute the assignment.
 */
public class AssignmentMain {

    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.setName("Rahul");
        manager.setEmployeeId(101);
        manager.setSalary(75000);
        manager.setDepartment("Finance");

        Developer developer = new Developer();

        developer.setName("Priya");
        developer.setEmployeeId(102);
        developer.setSalary(65000);
        developer.setProgrammingLanguage("Java");

        EmployeeUtilities utility = new EmployeeUtilities();

        utility.displayManager(manager);

        System.out.println();

        utility.displayDeveloper(developer);

        System.out.println();

        manager.setSalary(
                utility.incrementSalary(manager.getSalary()));

        developer.setSalary(
                utility.incrementSalary(developer.getSalary()));

        System.out.println("After Salary Increment");

        System.out.println("Manager Salary : "
                + manager.getSalary());

        System.out.println("Developer Salary : "
                + developer.getSalary());
    }
}