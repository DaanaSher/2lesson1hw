package com.company;

public class Model {

    private String modelName;
    private String brand;

    public Model(String modelName, String brand) {
        this.modelName = modelName;
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public String getBrand() {
        return brand;
    }
}
