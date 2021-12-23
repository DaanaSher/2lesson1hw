package com.company;

public final class Bmw extends Car{

    private Model model;
    private Color color;

    public Bmw(String passengerCar, double volume, Model model, Color color) {
        super(passengerCar, volume);
        this.model = model;
        this.color = color;
    }

    public Model getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nBrand: " + model.getBrand() +
                "\nModel: " + model.getModelName() +
                "\nColor: " + color;
    }
}
