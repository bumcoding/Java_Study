package Ch08_OOP.UseAbstract.impl;

import Ch08_OOP.UseAbstract.AbstractAnimal;

public class Cat extends AbstractAnimal {
    public Cat(){
        super();
    }
    public Cat(String category){
        super(category);
    }
    public void sound() {
        System.out.println("Meow");
    }
    
}
