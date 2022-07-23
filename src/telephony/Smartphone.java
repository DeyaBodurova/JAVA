package telephony;

import javax.swing.plaf.synth.SynthLookAndFeel;
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
        for (String number : numbers) {
            if (hasOnlyNumbers(number)) {
                sb.append("Calling... ").append(number).append(System.lineSeparator());
            } else {
                sb.append("Invalid number!").append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    public String browsable() {
        StringBuilder sb2 = new StringBuilder();
        for (String url : urls) {
            if (!hasNumber(url)) {
                sb2.append("Browsing: ").append(url).append(System.lineSeparator());
            } else {
             sb2.append("Invalid URL!").append(System.lineSeparator());
            }
        }
        return sb2.toString();
    }

    private boolean hasNumber(String text) {
        for (int i = 0; i < text.length(); i++) {
            if(Character.isDigit(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean hasOnlyNumbers(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
