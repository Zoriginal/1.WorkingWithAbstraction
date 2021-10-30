package A1WorkingWithAbstraction.A2Exersises.A5JediGalaxy;

public class Field {

    private int[][] fillMatrix;

    public Field(int row, int cow, int beginValue) {
        this.fillMatrix = new int[row][cow];
        this.fillValue(beginValue);
    }

    public Field(int row, int cow) {
        this.fillMatrix = new int[row][cow];
        this.fillValue(0);
    }

    public void fillValue(int beginValue) {
        for (int row = 0; row < fillMatrix.length; row++) {
            for (int cow = 0; cow < fillMatrix[row].length; cow++) {
                fillMatrix[row][cow] = beginValue++;
            }
        }
    }
}
