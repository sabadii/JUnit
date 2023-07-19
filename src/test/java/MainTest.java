import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testTaxEarningsMinusSpendings() {
        // Подготовка данных
        int expected = 75, earnings = 1000, spendings = 500;

        int result = Main.taxEarningsMinusSpendings(earnings, spendings);

        // Проверка результата
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testTaxEarningsMinusSpendingsNegative(){
        int expected = 0, earnings = 500, spendings = 1000;

        int result = Main.taxEarningsMinusSpendings(earnings, spendings);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testTaxEarnings(){
        int expected = 120, earnings = 2000;

        int result = Main.taxEarnings(earnings);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testTaxEarningsNegative(){
        int expected = 0, earnings = -500;

        int result = Main.taxEarnings(earnings);

        Assertions.assertEquals(expected, result);
    }
}
