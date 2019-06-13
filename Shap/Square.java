package Shap;

import interfaceresizeable.Resizeable;

public class Square extends Rectangle {
    public Square(){}

    public Square(double size , String color , boolean filled){
        super(size,size,color,filled);
    }

    public double getSize(){
        return getWeight();
    }

    public void setSize(double size){
        setWeight(size);
        setHeight(size);
    }

    @Override
    public void setHeight(double height) {
        setSize(height);
    }

    @Override
    public void setWeight(double weight) {
        setSize(weight);
    }

    @Override
    public void setResize(double percent) {
        super.weight*=percent;
    }

    @Override
    public String toString() {
        return "size = "+ getSize();
    }
}
