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


}
