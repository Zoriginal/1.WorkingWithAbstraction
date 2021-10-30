package A1WorkingWithAbstraction.A2Exersises.A4TrafficLights;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> colorsQueue = Arrays.stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toCollection(ArrayDeque::new));

        int count = Integer.parseInt(scan.nextLine());

        while (count-- > 0) {
            for (int i = 0; i < colorsQueue.size(); i++) {
                colorsQueue.offer(Colors.valueOf(colorsQueue.peek()).getNextColor());
                System.out.print(Colors.valueOf(colorsQueue.poll()).getNextColor() + " ");
            }
            System.out.println();
        }
    }
}
