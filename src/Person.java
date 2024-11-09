public class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name,
                  String position,
                  String email,
                  String phone,
                  int salary,
                  int age) {
        this.name = name;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.position = position;
        this.age = age;

    }

    public void getPerson() {
        System.out.println("ФИО: " + name + ", должность: " + position + ", email: " + email + ", телефон: " + phone + ", зарплата: " + salary + ", возраст " + age);
    }




}
