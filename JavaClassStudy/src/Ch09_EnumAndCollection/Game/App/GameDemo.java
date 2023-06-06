package Ch09_EnumAndCollection.Game.App;

import Ch09_EnumAndCollection.Game.Archer;
import Ch09_EnumAndCollection.Game.Knight;
import Ch09_EnumAndCollection.Game.Unit;
import Ch09_EnumAndCollection.Game.Controller.GameController;

public class GameDemo {
    public static void main(String[] args) {
        Unit Knight1 = new Knight("Knight1");
        Unit Archer1 = new Archer("Archer1");

        GameController gc = new GameController();

        gc.addUnit(Archer1);
        gc.addUnit(Knight1);
        
    }
}
