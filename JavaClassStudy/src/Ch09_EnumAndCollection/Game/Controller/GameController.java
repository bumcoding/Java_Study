package Ch09_EnumAndCollection.Game.Controller;

import java.util.ArrayList;

import Ch09_EnumAndCollection.Game.Unit;

public class GameController {
    protected ArrayList<Unit> unitList = new ArrayList<Unit>();

    public void addUnit(Unit unit) {
        this.unitList.add(unit);
    }

    public void move(int x, int y) {
        for(Unit e : unitList) {
            e.move(x, y);
        }
    }

    public void attack() {
        for(Unit e : unitList) {
            e.attack();
        }
    }
}
