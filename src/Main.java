public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        var firstName = "Ivan";
        var middletName = "Ivanovich";
        var lastName = "Ivanov";
        var fullName = lastName + " " + firstName + " " + middletName;
        System.out.println("ФИО сотрудника - " + fullName);

    }
    public static void  task2() {
        var firstName = "Ivan";
        var middletName = "Ivanovich";
        var lastName = "Ivanov";
        var fullName = lastName + " " + firstName + " " + middletName;
        System.out.println("ФИО сотрудника - " + fullName.toUpperCase());
    }
    public static void task3() {
        var Name = "Иванов Семён Семёнович";
        System.out.println(Name.replaceAll("ё","е"));
    }
}

