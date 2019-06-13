package Shap;

import interfaceresizeable.Resizeable;

public class Rectangle implements Resizeable {
    protected double weight=5.6;
    private double height=7.8;
    private String color="green";
    private boolean filled=true;

    public Rectangle(){}

    public Rectangle(double weight, double height, String color, boolean filled) {
        this.weight=weight;
        this.height=height;
        this.color=color;
        this.filled=filled;
    }

    double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public void setResize(double percent) {
        this.weight*=percent;
        this.height*=percent;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + weight +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
