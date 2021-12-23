package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("BMW", 2.5);
        System.out.println(car.getInfo());

        System.out.println("---");

        Model model = new Model("I8", "BMW");
        Bmw I8 = new Bmw("I8", 1.5, model, Color.BLACK);
        I8.makeSignal("врум врум");
        System.out.println(I8.getInfo());

        System.out.println("---");

        Model model2 = new Model("X5", "BMW");
        Bmw X5 = new Bmw("X5", 3.8, model2, Color.GREY);
        X5.makeSignal("врр");
        System.out.println(X5.getInfo());
    }
}
