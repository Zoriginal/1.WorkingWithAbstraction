package A1WorkingWithAbstraction.A1Lab;

public class A1Rhombus {
    private final int n;

    public A1Rhombus(int n) {
        this.n = n;
    }

    public String getFigure() {
        return this.getTop() + this.getMiddle() + this.getBottom();
    }

    private String getTop() {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i < n; i++) {
            output.append(repeatString(n - i, " "))
                    .append(repeatString(i, "* "))
                    .append(System.lineSeparator());
        }
        return output.toString();
    }

    private String getMiddle() {

        return repeatString(n, "* ") + System.lineSeparator();
    }

    private String getBottom() {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i < n; i++) {
            output.append(repeatString(i, " "))
                    .append(repeatString(n - i, "* "))
                    .append(System.lineSeparator());
        }
        return output.toString();
    }

    private String repeatString(int count, String str) {

        return String.valueOf(str).repeat(Math.max(0, count));
    }
}
