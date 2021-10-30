package A1WorkingWithAbstraction.A1Lab;

import java.util.Arrays;
import java.util.Scanner;

public class A2PointInRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] coordinates = ints(scan);

        A2Rectangle rectangle = new A2Rectangle(coordinates[0],coordinates[1],coordinates[2],coordinates[3]);
        int n = Integer.parseInt(scan.nextLine());

        while (n-->0){
            int[] point = ints(scan);
            A2Point point1 = new A2Point(point[0], point[1]);

            System.out.println(rectangle.contains(point1));
        }

    }
    public static int[] ints(Scanner scan){
        return Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
