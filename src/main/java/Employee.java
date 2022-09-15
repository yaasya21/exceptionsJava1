public class Employee {
    private int id;
    private static int nextId = 0;
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        if (name.length() > 15) {
            throw new FieldLengthLimitException("There are too much symbols in name");
        }
        else {
            this.name = name;
        }
        if (surname.length() > 15) {
            throw new FieldLengthLimitException("There are too much symbols in surname");
        }
        else {
            this.surname = surname;
        }
        if (salary < 0) {
            throw new IncorrectSalaryException("Salary must be positive");
        }
        else {
            this.salary = salary;
        }
        this.id = nextId++;
    }

    void PrintEmp() {
        System.out.println("ID:" + id + " " + name + " " + surname + " salary = " + salary);
    }
}

