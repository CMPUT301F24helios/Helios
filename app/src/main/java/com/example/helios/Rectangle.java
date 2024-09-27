package com.example.helios;

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        setLength(length);
        setBreadth(breadth);
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
