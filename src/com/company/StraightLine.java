package com.company;

import javafx.scene.paint.Color;

public class StraightLine implements Borderable{
       public void draw() {
        System.out.println("Линия");
    }

    @Override
    public double getBorderWidth() {
        return 0;
    }

    @Override
    public Color getBorderColor() {
        return null;
    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public double getScale() {
        return 0;
    }
}
