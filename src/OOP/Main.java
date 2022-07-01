package OOP;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits: ");
        Arrays.stream(Suits.values()).forEach(Suits ->
                System.out.printf("Ordinal value: %d; Name value: %s\n", Suits.ordinal(), Suits.name()));
    }
}
