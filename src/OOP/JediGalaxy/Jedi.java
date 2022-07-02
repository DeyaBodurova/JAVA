package OOP.JediGalaxy;

public class Jedi {
    public static long moveJedi(BattleField battleField, int jediRow, int jediCol) {
        long jediSum = 0;
        while (jediRow >=0 && jediCol < battleField.getColLength()) {
            if(battleField.isInBounds(jediRow, jediCol)) {
            jediSum += battleField.getValue(jediRow, jediCol);
            }
            jediRow--;
            jediCol++;
        }
        return jediSum;
    }
}
