package OOP.JediGalaxy;

public class Galaxy {
    private BattleField field;

    public Galaxy(BattleField field) {
        this.field = field;
    }

    public void moveEvil(int r, int c) {
        Evil.moveEvil(this.field, r, c);
    }

    public long moveJedi(int r, int c) {
        return Jedi.moveJedi(this.field, r, c);
    }
}
