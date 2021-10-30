package A1WorkingWithAbstraction.A2Exersises.A5JediGalaxy;

import java.time.Month;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static long sum = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimension = ints(scanner.nextLine());
        int x = dimension[0];
        int y = dimension[1];

        int[][] newMatrix = fillMatrix(scanner);

        String command = scanner.nextLine();

        while (!command.equals("Let the Force be with you")) {
            int[] coordinatesPeter = ints(command);

            int[] coordinatesEvil = ints(scanner.nextLine());

            coordinates(newMatrix, coordinatesEvil);
            coordinatesSum(newMatrix, coordinatesPeter);

            command = scanner.nextLine();
        }
        System.out.println(sum);

    }

    private static void coordinatesSum(int[][] newMatrix, int[] coordinatesPeter) {
        int row = coordinatesPeter[0];
        int cow = coordinatesPeter[1];
        while (row >= 0 && cow < newMatrix[1].length) {
            if (isInMatrix(newMatrix, row, cow)) {
                sum += newMatrix[row][cow];
            }
            cow++;
            row--;
        }
    }

    private static boolean isInMatrix(int[][] newMatrix, int row, int cow) {
        return row >= 0 && row < newMatrix.length && cow >= 0 && cow < newMatrix[0].length;
    }

    private static void coordinates(int[][] newMatrix, int[] coordinatesEvil) {
        int row = coordinatesEvil[0];
        int cow = coordinatesEvil[1];

        while (row >= 0 && cow >= 0) {
            if (isInMatrix(newMatrix, row, cow)) {
                newMatrix[row][cow] = 0;
            }
            row--;
            cow--;
        }
    }

    private static int[] ints(String input) {
        return Arrays.stream(input.split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }

    private static int[][] fillMatrix(Scanner scanner) {
        int[] dimension = ints(scanner.nextLine());
        int x = dimension[0];
        int y = dimension[1];

        int[][] matrix = new int[x][y];

        int value = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }
}
