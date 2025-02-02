import org.fhcampus02.at.BMICalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMICalculatorTest {

    @Test
    public void testConstructor() {
        BMICalculator bmiCalculator = new BMICalculator("John", "Doe", 180, 75.0, 'm');
        assertEquals("John", bmiCalculator.getFirstname());
        assertEquals("Doe", bmiCalculator.getLastname());
        assertEquals(180, bmiCalculator.getBodyHeight());
        assertEquals(75.0, bmiCalculator.getBodyWeight(), 0.01);
        assertEquals('m', bmiCalculator.getGender());
    }

}
