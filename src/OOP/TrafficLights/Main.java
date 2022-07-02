package OOP.TrafficLights;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> trafficLights  = Arrays.stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toList());

    }
}
