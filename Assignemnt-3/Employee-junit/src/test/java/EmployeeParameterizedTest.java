import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.junit.Employee;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeParameterizedTest {

    @ParameterizedTest
    @ValueSource(doubles = {50000.0, 60000.0, 75000.0})
    void testCalculateYearlyBonus(double salary) {
        Employee employee = new Employee(1, "John Doe", salary);
        double expectedBonus = salary * 0.1; 
        assertEquals(expectedBonus, employee.calculateYearlyBonus(), 0.01);
    }
}
