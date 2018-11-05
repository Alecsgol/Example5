package ru.goluzov.se;

import org.junit.Test;

public class AppTest {
    private final int COUNT = 5;
    private Example5.Employee[] employee;
    public AppTest() {
        employee = new Example5.Employee[COUNT];
        employee[0] = new Example5.Employee("P1 Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        employee[1] = new Example5.Employee("P2 Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 41);
        employee[2] = new Example5.Employee("P3 Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        employee[3] = new Example5.Employee("P4 Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 56);
        employee[4] = new Example5.Employee("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 30);
    }
    @Test
    public void getOver40oldTest() {
        Example5.Employee.getOver40old(employee);
    }
}
