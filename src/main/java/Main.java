public class Main {
    public static void main(String[] args)
    {
        try {
            Employee emp = new Employee("Volodymyr", "Zelenskiy", 1000000);
            emp.PrintEmp();
        }catch(FieldLengthLimitException exp) {
            System.out.println(exp.getMessage());
        } catch (IncorrectSalaryException exp2) {
            System.out.println(exp2.getMessage());
        }

    }
}
