package ducks;

import behavior.fly.FlyWithWings;
import behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm real Mallard duck");
    }
}
