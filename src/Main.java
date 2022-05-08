public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    //task1
        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();
        //task2
        String Name = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + Name);
        System.out.println();
        //task3
        String Name2 = fullName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + Name2);
    }
}