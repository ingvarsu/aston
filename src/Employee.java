
    public class Employee {
        String name;
        String email;
        String phone;
        int salary;
        int age;

        public Employee(String empName, String empEmail, String empPhone, int empSalary, int empAge){
            this.name = empName;
            this.email = empEmail;
            this.phone = empPhone;
            this.salary = empSalary;
            this.age = empAge;
        }

        public void getEmployee(){
            System.out.println("имя: " + name + ", e-mail: " + email + ", телефон: " + phone + ", зарплата: " + salary + ", возраст: " + age);
        }
}
