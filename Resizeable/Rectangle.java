package Resizeable;

import Comparator.Shape;

public class Rectangle extends Shape implements Resizeable{
    private double width;
    private double length;

    public Rectangle(){
        this.width =1.0;
        this.length =1.0;
    }

    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

    public String toString(){
        return "A Rectangle with width "+width+" and length, "+length+" , which is a subclass of "+super.toString();
    }

    @Override
    public void resize(double percent) {
        setLength(getLength() * Math.sqrt((100+ percent) / 100));
        setWidth(getWidth() * Math.sqrt((100+ percent) / 100));
    }
}