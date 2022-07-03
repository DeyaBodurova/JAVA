package Advance.StacksAndQueues;
import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        if (input.length % 2 != 0) {
            System.out.println("NO");
        } else {
            ArrayDeque<String> stack = new ArrayDeque<>();
            ArrayDeque<String> queue = new ArrayDeque<>();
            for (int i = 0; i < input.length / 2; i++) {
                stack.push(input[i]);
            }
            for (int i = input.length / 2; i < input.length ; i++) {
                queue.add(input[i]);
            }
            if(!stack.isEmpty() && !queue.isEmpty()) {
                while (!stack.isEmpty() && !queue.isEmpty()) {
                    String current = stack.peek();
                    switch (current) {
                        case "{":
                            if(queue.peek().equals("}")) {
                                stack.pop();
                                queue.poll();
                            } else {
                                System.out.println("NO");
                                break;
                            }
                            break;
                        case "[":
                            if(queue.peek().equals("]")) {
                                stack.pop();
                                queue.poll();
                            } else {
                                System.out.println("NO");
                                break;
                            }
                            break;
                        case "(":
                            if(queue.peek().equals(")")) {
                                stack.pop();
                                queue.poll();
                            } else {
                                System.out.println("NO");
                                break;
                            }
                            break;
                        default:
                            System.out.println("NO");
                            break;
                    }
                }
                if (stack.isEmpty() && queue.isEmpty()) {
                    System.out.println("YES");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
