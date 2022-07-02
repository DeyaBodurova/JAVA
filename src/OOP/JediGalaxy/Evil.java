package OOP.JediGalaxy;

public class Evil {
    public static void moveEvil(BattleField battleField, int evilRow, int evilCol) {
        while (evilRow >= 0 && evilCol >= 0) {
            if (battleField.isInBounds(evilRow, evilCol)) {
                battleField.setValue(evilRow, evilCol, 0);
            }
            evilRow--;
            evilCol--;
        }
    }
}
