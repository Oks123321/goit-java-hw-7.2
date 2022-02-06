package com.company;

import javafx.scene.paint.Color;

public class Text implements Scalable {
    int x, y, z;
    int red, green, blue;
    int sizeScale;

    public void draw() {
        System.out.println("Текст");
    }

    protected void setColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;

    }

    @Override
    public void setScale(int sizeScale) {
        this.sizeScale = sizeScale;
    }

}


