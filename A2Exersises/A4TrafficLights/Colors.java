package A1WorkingWithAbstraction.A2Exersises.A4TrafficLights;

public enum Colors {
    GREEN("YELLOW"),
    RED("GREEN"),
    YELLOW("RED");

    private String nextColor;

    Colors(String nextColor){
        this.nextColor = nextColor;
    }

    public String getNextColor() {
        return nextColor;
    }
}
