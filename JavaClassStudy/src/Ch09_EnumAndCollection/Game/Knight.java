package Ch09_EnumAndCollection.Game;

public class Knight extends Unit {
    
}
public void attack() {
    System.out.println("swooshes sword");
}
Override
public void move(int x, int y) {
    System.out.printf("[%s] is moving to (%s, %s)\n", this.getUnitName() , x, y);
}