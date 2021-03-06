package ru.goluzov.se;

public class Example5 {
    public static class Employee {
        private String fio;
        private String position;
        private String email;
        private String phone;
        private double salary;
        private int age;

        Employee(String fio, String position, String email, String phone, double salary, int age) {
            this.fio = fio;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }
        static void getOver40old(Employee[] employees) {
            for (Employee employee : employees) {
                if (employee.age > 40) {
                    System.out.println(employee.toString());
                }
            }
        }
        @Override
        public String toString() {
            return "Employee{" +
                    "fio='" + fio + '\'' +
                    ", position='" + position + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    ", salary=" + salary +
                    ", age=" + age +
                    '}';
        }
    }
}
