import ru.netology.services.CountRestService;

public class Main {
    public static void main(String[] args) {
        CountRestService service = new CountRestService();
        int count = service.calculate(10_000, 3000, 20_000);
        System.out.println(count);
    }
}
