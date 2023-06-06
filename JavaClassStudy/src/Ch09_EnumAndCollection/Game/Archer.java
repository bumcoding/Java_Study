package Ch09_EnumAndCollection.Game;

public class Archer extends Unit {
    
    
}
public Archer(String unitName) {

}

public void attack() {
    System.out.println("shoots arrow!");
}

Override
public void move(int x, int y) {
    System.out.printf("[%s] is slowly moving to (%s, %s)\n", this.getUnitName(), x, y);
}
