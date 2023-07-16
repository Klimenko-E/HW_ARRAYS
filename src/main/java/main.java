import ru.netology.stats.StatsService;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println(service.getSalesAmount(sales));

        int avSales = service.getAverageSalesAmount(sales);
        System.out.println(avSales);

        System.out.println(service.getMaxMonth(sales));

        System.out.println(service.getMinMonth(sales));

        System.out.println(service.getLessAverageSalesAmount(sales));

        System.out.println(service.getMoreAverageSalesAmount(sales));

    }

}
