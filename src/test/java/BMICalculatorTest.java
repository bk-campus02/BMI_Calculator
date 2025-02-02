import org.fhcampus02.at.BMICalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMICalculatorTest {

    @Test
    public void testConstructor() {
        BMICalculator bmiCalculator = new BMICalculator("John", "Doe", 180, 75, 'm');
        assertEquals("John", bmiCalculator.getFirstname());
        assertEquals("Doe", bmiCalculator.getLastname());
        assertEquals(180, bmiCalculator.getBodyHeight());
        assertEquals(75, bmiCalculator.getBodyWeight());
        assertEquals('m', bmiCalculator.getGender());
    }

    @Test
    public void testCalculateBMI() {
        BMICalculator bmiCalculator1 = new BMICalculator("John", "Doe", 170, 70, 'm');
        assertEquals(24.22, bmiCalculator1.calculateBMI());

        BMICalculator bmiCalculator2 = new BMICalculator("John", "Doe", 180, 120, 'm');
        assertEquals(37.03, bmiCalculator2.calculateBMI(), 0.01);

    }

    @Test
    public void testCalculateBMICategory() {
        BMICalculator male = new BMICalculator("John", "Doe", 180, 120, 'm');
        assertEquals(2, male.calculateBMICategory());

        BMICalculator female = new BMICalculator("Jane", "Doe", 170, 70, 'w');
        assertEquals(1, female.calculateBMICategory());
    }

}
