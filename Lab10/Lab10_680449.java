import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lab10_680449 {

    record SalesOrder(String item, double price, int qty, String category) {
    }

    static List<SalesOrder> salesOrders = new ArrayList<>(List.of(
            new SalesOrder("Laptop Pro", 45000.0, 2, "Tech"),
            new SalesOrder("Mechanical Keyboard", 3500.0, 10, "Tech"),
            new SalesOrder("Wireless Mouse", 850.0, 25, "Tech"),
            new SalesOrder("Monitor 27 inch", 12000.0, 4, "Tech"),
            new SalesOrder("USB-C Hub", 1200.0, 15, "Tech"),
            new SalesOrder("Webcam 4K", 4500.0, 3, "Tech"),

            new SalesOrder("Leather Jacket", 5500.0, 2, "Cloth"),
            new SalesOrder("Cotton T-Shirt", 450.0, 50, "Cloth"),
            new SalesOrder("Denim Jeans", 1800.0, 15, "Cloth"),
            new SalesOrder("Wool Scarf", 800.0, 5, "Cloth"),
            new SalesOrder("Running Shoes", 3200.0, 8, "Cloth"),

            new SalesOrder("Organic Apple", 35.0, 120, "Fruit"),
            new SalesOrder("Golden Banana", 15.0, 200, "Fruit"),
            new SalesOrder("Imported Grapes", 150.0, 40, "Fruit"),
            new SalesOrder("Durian Monthong", 500.0, 10, "Fruit"),
            new SalesOrder("Sweet Mango", 60.0, 60, "Fruit"),

            new SalesOrder("Office Chair", 7500.0, 3, "Home"),
            new SalesOrder("Standing Desk", 15000.0, 2, "Home"),
            new SalesOrder("Table Lamp", 1200.0, 12, "Home"),
            new SalesOrder("Air Purifier", 9800.0, 5, "Home")));

    record WeatherLog(String city, double temp, double humidity, String date) {
    }

    static List<WeatherLog> weatherLogs = new ArrayList<>(List.of(
            new WeatherLog("Bangkok", 32.5, 88.0, "2024-03-01"),
            new WeatherLog("Bangkok", 35.2, 82.0, "2024-03-02"),
            new WeatherLog("Bangkok", 34.0, 85.0, "2024-03-03"),
            new WeatherLog("Bangkok", 31.8, 92.0, "2024-03-04"),

            new WeatherLog("Tokyo", 8.5, 45.0, "2024-03-01"),
            new WeatherLog("Tokyo", 10.2, 40.0, "2024-03-02"),
            new WeatherLog("Tokyo", 12.0, 38.0, "2024-03-03"),
            new WeatherLog("Tokyo", 5.5, 50.0, "2024-03-04"),

            new WeatherLog("London", 12.0, 90.0, "2024-03-01"),
            new WeatherLog("London", 11.5, 85.0, "2024-03-02"),
            new WeatherLog("London", 9.0, 95.0, "2024-03-03"),
            new WeatherLog("London", 14.2, 80.0, "2024-03-04"),

            new WeatherLog("Moscow", -12.5, 30.0, "2024-03-01"),
            new WeatherLog("Moscow", -15.0, 25.0, "2024-03-02"),
            new WeatherLog("Moscow", -10.2, 35.0, "2024-03-03"),
            new WeatherLog("Moscow", -5.0, 40.0, "2024-03-04"),

            new WeatherLog("Dubai", 42.0, 15.0, "2024-03-01"),
            new WeatherLog("Dubai", 45.5, 12.0, "2024-03-02"),
            new WeatherLog("Dubai", 43.8, 18.0, "2024-03-03"),
            new WeatherLog("Dubai", 40.0, 20.0, "2024-03-04")

    ));

    public static void main(String[] args) {
        // q1();
        // q2();
        // q3();
        // q4();
        // q5();
        // q6();
        // q7();
        // q8();
        // q9();
        //q10();
        //q11();
        //q12();
        //q13();
        //q14();
        //q15();
        //q16();
        //q17();
        //q18();
        //q19();
        q20();
    }

    static void q1() {
        // List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> input = new ArrayList<>(Arrays.asList(0, 1, 5, 7, 8, 10, 20));
        input.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
    }

    static void q2() {
        // String input = "Java Stream API is very powerful";
        String input = "This lab is too difficult. Please help me.";
        Arrays.stream(input.split(" "))
                .filter(n -> n.length() > 5)
                .forEach(n -> System.out.print(n + " "));
    }

    static void q3() {
        List<String> input = new ArrayList<>(Arrays.asList("Jeff", "Bill", "Mark", "Bob"));
        input.stream()
                .collect(Collectors.groupingBy(n -> n.charAt(0)))
                .forEach((k, v) -> System.out.println(k + ": " + v));

    }

    static void q4() {
        List<String> input = new ArrayList<>(
                Arrays.asList("Apple", "Banana", "Orange", "Jeff", "Bill", "Mark", "Bob"));
        // int a = 3;
        // int b = 2;
        /*
         * input.stream()
         * .skip(a)
         * .limit(b)
         * .forEach(n -> System.out.print(n + " "));
         */
        int a = 1;
        int b = 4;
        input.stream()
                .skip(a)
                .limit(b)
                .forEach(n -> System.out.print(n + " "));
    }

    static void q5() {
        // List<String> input = new ArrayList<>(List.of("Apple", "Orange",
        // "Apple","Banana", "Orange"));

        List<String> input = new ArrayList<>(
                List.of("Milk", "Orange", "Apple", "Banana", "Orange", "Water", "Coke", "Apple",
                        "Milk"));
        input.stream()
                .distinct()
                .sorted()
                .forEach(n -> System.out.print(n + " "));
    }

    static void q6() {
        // List<String> เช่น [Jeff, Bill, Mark]
        List<String> input = new ArrayList<>(Arrays.asList("Jeff", "Bill", "Mark"));
        String result = input.stream()
                .collect(Collectors.joining(", "));
        System.out.print(result);

    }

    static void q7() {

        // List<String> input = new ArrayList<>(Arrays.asList("Jeff", "Bill", "Mark"));
        List<String> input = new ArrayList<>(Arrays.asList("Java", "Stream", "API"));
        input.stream()
                .map(n -> n.length()) // map ใช้แปลง Type หนึ่งสู่อีก Type หนึ่ง
                .forEach(n -> System.out.print(n + " "));
    }

    static void q8() {
        List<List<Integer>> input = new ArrayList<>(List.of(
                List.of(1, 2),
                List.of(2, 3),
                List.of(4, 5)));
        List<Integer> result = input.stream()
                .flatMap(list -> list.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);
    }

    static void q9() {
        List<Double> input = new ArrayList<>(Arrays.asList(1.5, 2.5, 5.0));
        double result = input.stream()
                .mapToDouble(n -> n)
                .average()
                .orElse(0.0);
        System.out.print(result);
    }

    static void q10() {
        // String input = "abcd";
        String input = "aawerxvxcfgasdlfxnsrpwemsvk";
        double avg = input.chars().average().orElse(0.0);
        long roundAvg = Math.round(avg);
        char result = (char) roundAvg;
        System.out.print(result);
    }

    static void q11() {
        var result = salesOrders.stream()
                        .collect(Collectors.groupingBy(SalesOrder::category
                            ,Collectors.summingDouble(n -> n.price() * n.qty())
                        ));
                        result.forEach((k,v) -> System.out.println(k + ": " + v));
    }

    static void q12() {
        var result = salesOrders.stream()
                        .sorted(Comparator.comparingDouble((SalesOrder s) -> s.price() * s.qty())
                        .reversed())
                        .limit(3);
                        result.forEach((n) -> System.out.println(n.item() + ": " + (n.price() * n.qty())));
    }

    static void q13() {
        salesOrders.stream()
                    .forEach((n) -> System.out.println(n.item() + ": " + (n.price * 0.85)));
    }

    static void q14() {
        Map<String, Double> input = new HashMap<>();
        input.put("Home", 0.15);
        input.put("Tech", 0.20);
        input.put("Cloth", 0.10);
        input.put("Fruit", 0.05);
        salesOrders.stream()
                    .forEach(s -> System.out.println
                        (s.item() + ": " + (s.price() * (1 - input.get(s.category())))
                    ));
    }

    static void q15() {
        DoubleSummaryStatistics stat = salesOrders.stream()
        .mapToDouble(n -> n.price() * n.qty())
        .summaryStatistics();
        
        System.out.print("Min: " + stat.getMin() + "\n" +
                         "Max: " + stat.getMax() +  "\n" +
                         "Average: " + stat.getAverage() + "\n" +
                         "Sum: " + stat.getSum()
        );
    }

    static void q16() {
        var result = weatherLogs.stream()
                    .mapToDouble(n -> n.temp())
                    .average()
                    .orElse(0.0);
                    System.out.print(result);
    }

    static void q17() {
        var result = weatherLogs.stream()
                        .collect(Collectors.groupingBy(n -> n.city()
                    ,Collectors.averagingDouble(n -> n.temp())
                ));
                result.forEach((city,temp) -> System.out.println(city + ": " + temp));
    }

    static void q18() {
        var statgroup = weatherLogs.stream()
                    .collect(Collectors.groupingBy(n -> n.city()
                    ,Collectors.summarizingDouble(n -> n.temp())
                ));
                statgroup.forEach((city,stat) -> {
                    double max = stat.getMax();
                    double min = stat.getMin();
                    double diff = max - min;

                    System.out.printf("%s: %.2f %.2f %.2f\n",city,max,min,diff);
                });
    }

    static void q19() {
        weatherLogs.stream()
        .map(n -> {
            String status = "";
            if(n.temp > 30){
                status = "HOT";
            }else if(n.temp < 12){
                status = "COLD";
            }else{
                status = "NORMAL";
            }
            return "Date: " + n.date + "| City: " + n.city + "| Status: " + status;
        })
        .forEach(result -> System.out.println(result));
    }

    static void q20() {
        var countCity = weatherLogs.stream()
        .collect(Collectors.groupingBy(n -> n.city(),
        Collectors.summingInt(w -> w.humidity() > 60 ? 1 : 0)
    ));
        countCity.forEach((city,count) -> System.out.println(city + ": " + count));
    }
}