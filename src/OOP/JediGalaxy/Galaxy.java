package OOP.JediGalaxy;

public class Galaxy {
   private BattleField battleField;

   public Galaxy (BattleField battleField) {
      this.battleField = battleField;
   }

   public void moveEvil(int r, int c) {
      Evil.moveEvil(this.battleField, r, c);
   }

   public long moveJedi(int r, int c) {
      return Jedi.moveJedi(this.battleField, r, c);
   }
}
