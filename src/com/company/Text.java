package com.company;

import javafx.scene.paint.Color;

public class Text implements Drawable
{
     public void draw() {
        System.out.println("Текст");
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
}


