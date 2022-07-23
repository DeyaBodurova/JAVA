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
        StringBuilder sb = new StringBuilder();
        for (String number:numbers) {
            sb.append("Calling... ").append(number).append("%n");
        }
        return sb.toString();
    }

    public String browsable() {
        StringBuilder sb = new StringBuilder();
        for (String url:urls) {
            if (url.contains()) {

            }
            sb.append("Browsing: " + url + "!%n");
        }
        return sb.toString();
    }

    private boolean hasOnlyNumbers(String text) {
        for (int i = 0; i < text.length(); i++) {
            if(!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
