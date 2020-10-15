package Employee;

class Main {
  public static void main(String[] args) {
    Employee sara = new Employee("Sara", "sara.wilson@company.com");

    CompanyRoster c = new CompanyRoster();

    System.out.println(c.display(sara));
  }
}
