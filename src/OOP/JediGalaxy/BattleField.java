package OOP.JediGalaxy;

public class BattleField {
    private int[][] battleField;

    public BattleField(int r, int c) {
        this.battleField = new int[r][c];
        this.fillInBattleField(r,c);
    }

    public void fillInBattleField(int r, int c) {
        int num = 0;
        for (int row = 0; r < r; r++) {
            for (int col = 0; col < c; col++) {
                this.battleField[r][c] = num ++;
            }
        }
    }
    public  boolean isInBounds(int r, int c) {
        return (r >= 0 && r < this.battleField.length) && (c >= 0 && c < this.battleField[r].length);
    }

    public int getValue(int r, int c) {
        return this.battleField[r][c];
    }

    public void setValue(int r, int c, int newValue) {
        this.battleField[r][c] = newValue;
    }

    public int getColLength() {
        return this.battleField[1].length;
    }
}
