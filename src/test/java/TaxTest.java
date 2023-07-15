import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxTest {
    @Test
    public void testTaxEarningsMinusSpendings() {
        // Подготовка данных
        int earnings = 1000;
        int spendings = 500;

        // Выполнение метода
        int result = TaxCalculator.taxEarningsMinusSpendings(earnings, spendings);

        // Проверка результата
        assertEquals(75, result);
    }
}

