package OOP.TrafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> trafficLights = new ArrayList<>();
        Arrays.stream(sc.nextLine().split("\\s+")).toList().stream().collect(Collectors.toList());

    }
}
