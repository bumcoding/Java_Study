package Ch08_OOP.UseAbstract.App;

import Ch08_OOP.UseAbstract.impl.Cat;
import Ch08_OOP.UseAbstract.impl.Dog;

public class animalDemo {
    public static void main(String[] args){
        Dog dog = new Dog("Dog");
        dog.sound();
        dog.sound(5);
        dog.showCategoryName();
        
        Cat cat = new Cat("Cat");
        cat.sound();
        cat.showCategoryName();
    }
}
