public class Main {




    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanov Ivan", "mail@mail.ru", "89991110000", 100000, 30 );
        employee1.getEmployee();



        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivan@mailbox.com", "89991110000", 300000, 30);
        persArray[1] = new Person("Andreev Andrei", "QA", "andrei@mailbox.com", "89992221212", 100000, 25);
        persArray[2] = new Person("Sergeev Sergey", "Developer", "sergey@mailbox.com", "89993331212", 200000, 35);
        persArray[3] = new Person("Pavlov Pavel", "Manager", "pavel@mailbox.com", "89994441212", 150000, 40);
        persArray[4] = new Person("Vladimirov Vladimir", "CEO", "vladimir@mailbox.com", "89995551212", 400000, 50);

        for (Person perArray : persArray) {
            perArray.getPerson();
        }



        Park park = new Park();
        Park.Attraction londonEye = park.createAttraction("Колесо обозрения", "9.00 - 22.00", 1000);
        Park.Attraction rocket = park.createAttraction("Ракета", "12.00 - 20.00", 3000);
        System.out.println(londonEye);
        System.out.println(rocket);





    }
}