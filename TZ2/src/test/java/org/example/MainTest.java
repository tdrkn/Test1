import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testMin() {
        int[] numbers = {1, 1, 9, 3, -1};
        int result = Main._min(numbers);
        assertEquals(-1, result);
    }
//    Тест определяет минимум в массиве чисел, который равен -1.

    @Test
    public void testMax() {
        int[] numbers = {1, 1, 9, 3, -1};
        int result = Main._max(numbers);
        assertEquals(9, result);
    }
//    Тест определяет максимум в массиве чисел, который равен 9.

    @Test
    public void testSum() {
        int[] numbers = {1, 1, 9, 3, -1};
        int result = Main._sum(numbers);
        assertEquals(13, result);
    }
//    Тест определяет сумму чисел в массиве, которая равна 13.

    @Test
    public void testMult() {
        int[] numbers = {1, 1, 9, 3, -1};
        long result = Main._mult(numbers);
        assertEquals(-27, result);
    }
//    Тест определяет произведение чисел в массиве, которое равно -27.


    @Test
    public void testMinSame() {
        int[] numbers = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int result = Main._min(numbers);
        assertEquals(1, result);
    }
//    Тест определяет максимум среди массива одинаковых чисел

    @Test
    public void testMaxSame() {
        int[] numbers = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int result = Main._max(numbers);
        assertEquals(1, result);
    }
//    Тест определяет минимум среди массива одинаковых чисел


}
