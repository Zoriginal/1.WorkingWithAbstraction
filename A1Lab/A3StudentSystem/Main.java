package A1WorkingWithAbstraction.A1Lab.A3StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();

        String[] data = scanner.nextLine().split("\\s+");

        while (!data[0].equals("Exit")){
            studentSystem.parseCommand(data);
            data = scanner.nextLine().split("\\s+");
        }
    }
}
