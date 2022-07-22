package telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private static List<String> numbers;
    private static List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        setNumbers(numbers);
        setUrls(urls);
    }

    public static List<String> getNumbers() {
        return numbers;
    }

    public static void setNumbers(List<String> numbers) {
        Smartphone.numbers = numbers;
    }

    public static List<String> getUrls() {
        return urls;
    }

    public static void setUrls(List<String> urls) {
        Smartphone.urls = urls;
    }

    public String call() {
        return null;
    }

    public String browsable() {
        return null;
    }
}
