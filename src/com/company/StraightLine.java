package com.company;

public class StraightLine implements Borderable {
    public void draw() {
        System.out.println("Линия");
    }

    int x, y, z;
    int red, green, blue;
    int sizeBorderWidth;
    int sizeScale;

    protected void setColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public void setBorderWidth(int sizeBorderWidth) {
        this.sizeBorderWidth = sizeBorderWidth;
    }

    @Override
    public void setScale(int sizeScale) {

    }
}

