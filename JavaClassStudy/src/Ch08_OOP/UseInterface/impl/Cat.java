package Ch08_OOP.UseInterface.impl;

import  Ch08_OOP.UseInterface.InterfaceAnimal;

public class Cat implements InterfaceAnimal {
    public void sound() {
        System.out.println(CATEGORY + " Meow");
    }
}
