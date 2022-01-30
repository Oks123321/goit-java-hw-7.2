package com.company;

import javafx.scene.paint.Color;

public class Circle extends Shape {
    double radius;

    @Override
    public void draw() {
        System.out.println("Круг");
    }

    @Override
    public double getBorderWidth() {
        return super.getBorderWidth();
    }

    @Override
    public Color getBorderColor() {
        return super.getBorderColor();
    }

    @Override
    public double getX() {
        return super.getX();
    }

    @Override
    public double getY() {
        return super.getY();
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }

    @Override
    public double getScale() {
        return super.getScale();
    }
}
