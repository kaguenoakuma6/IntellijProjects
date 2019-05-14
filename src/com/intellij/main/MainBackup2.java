package com.intellij.main;

import com.intellij.challenge.Outlander;

public class MainBackup2
{
    public static void main(String[] Args)
    {
        /*Animal animal = new Animal("doggie", 1, 1, 5, 5);

        Dog dog = new Dog("Boby", 8, 20, 2, 4, 1, 30, "long silky");
        dog.eat();
        dog.run();*/
        /**/
        Outlander outlander = new Outlander(30);
        outlander.steer(50);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-35);
    }

}
