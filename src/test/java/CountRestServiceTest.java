import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.CountRestService;

import java.util.concurrent.Callable;

public class CountRestServiceTest {

    @Test
    public void ShouldCalcExact() {
        CountRestService service = new CountRestService();

        int expected = 3;
        int actual = service.calculate(10_000, 3000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCalcInExact() {
        CountRestService service = new CountRestService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}