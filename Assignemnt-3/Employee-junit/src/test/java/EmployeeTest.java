import org.junit.jupiter.api.Test;

import com.junit.Employee;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    void testEmployeeAttributes() {
        Employee employee = new Employee(1, "John Doe", 50000.0);

        assertEquals(1, employee.getId());
        assertEquals("John Doe", employee.getName());
        assertEquals(50000.0, employee.getSalary(), 0.01);
    }

    @Test
    void testRaiseSalary() {
        Employee employee = new Employee(1, "Jane Smith", 60000.0);
        employee.raiseSalary(5000.0);

        assertEquals(65000.0, employee.getSalary(), 0.01);
    }

    @Test
    void testEmployeeEquality() {
        Employee employee1 = new Employee(1, "Alice", 70000.0);
        Employee employee2 = new Employee(1, "Alice", 70000.0);

        assertEquals(employee1, employee2);
        assertNotSame(employee1, employee2);
    }
}
