package Advance.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int countCommands = Integer.parseInt(sc.nextLine());

        while(countCommands > 0) {
            int[] command = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            switch (command[0]) {
                case 1:
                    stack.push(command[1]);
                    break;
                case 2:
                    if(!stack.isEmpty()) {
                    stack.pop();
                    }
                    break;
                case 3:
                    int maxElement = Integer.MIN_VALUE;
                    while (!stack.isEmpty()){
                        if(stack.peek()>maxElement){
                            maxElement = stack.pop();
                        } else {
                            stack.pop();
                        }
                    }
                    System.out.println(maxElement);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid command!");
            }

            countCommands--;
        }

    }
}
