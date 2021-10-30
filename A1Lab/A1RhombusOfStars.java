package A1WorkingWithAbstraction.A1Lab;

import java.util.Scanner;

public class A1RhombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        A1Rhombus rhombus = new A1Rhombus(rows);
        System.out.println(rhombus.getFigure());

        printTop(rows);
        print(rows,"* ");
        System.out.println();
        printDown(rows);
    }
    public static void print(int n,String str){
        for (int j = 1; j <= n; j++) {
            System.out.print(str);
        }
    }
    public static void printTop(int n){
        for (int i = 1; i <= n - 1; i++) {
            print(n-i," ");
            print(i,"* ");
            System.out.println();
        }
    }
    public static void printDown(int n){
        for (int i = 1; i <= n - 1 ; i++) {
            print(i," ");
            print(n-i,"* ");
            System.out.println();
        }
    }
}
