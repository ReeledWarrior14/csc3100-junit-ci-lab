import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestHypotenuse {

        @Test
        @DisplayName("Test the hypotenuse function")
        void testHypotenuse(){
            assertEquals(5.0, Main.hypotenuse(3.0, 4.0), 0.001);
            assertEquals(13.0, Main.hypotenuse(5.0, 12.0), 0.001);
            assertEquals(22.360679774997898, Main.hypotenuse(10, 20), 0.001);
        }

}
