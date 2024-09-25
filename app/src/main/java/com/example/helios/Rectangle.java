package com.example.helios;

public class Rectangle extends Shape {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        setBreadth(breadth);
        setLength(length);
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
