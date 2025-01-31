public class Employee {
    int id = 1;
    String name = "John";
    String social_sec = "abcd001";
    Double salary = 550000.0;
    public void set_inf(int id, String name, String ssnum, Double salary) {
        this.id = id;
        this.name=name;
        this.social_sec = ssnum;
        this.salary = salary;
    }

    public void getInfo() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(social_sec);
        System.out.println(salary);
    }
}
