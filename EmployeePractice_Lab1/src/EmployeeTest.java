public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee_1 = new Employee();
        employee_1.getInfo();
        employee_1.set_inf(101,"Jane Smith", "012-34-4567", 120345.27);
        employee_1.getInfo();
    }
}