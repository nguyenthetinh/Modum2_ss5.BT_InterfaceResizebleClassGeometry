package Shap;

import interfaceresizeable.Resizeable;

public class Circle implements Resizeable {
    private double radius=3.7;
    private String color="blue";
    private boolean filled=true;

    public Circle(){
    }

    public Circle(double radius , String color , boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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

    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public void setResize(double percent) {
        radius*=percent;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
