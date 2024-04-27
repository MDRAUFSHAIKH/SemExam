import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExamTest {

    @Test
    public void testFindMax() {
        // Given
        Exam exam = new Exam();
        int[] numbers = {1, 3, 4, 2};

        // When
        int max = exam.findMax(numbers);

        // Then
        assertEquals(4, max); // We expect the maximum value to be 4
    }
}