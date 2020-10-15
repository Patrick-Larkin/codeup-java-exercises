package Employee;

public class CompanyRoster implements Formatter {

    public static String display(Employee employee) {
        return String.format("Employee-Name: %s | Employee-Email: %s", employee.getName(), employee.getEmail());
    }
}