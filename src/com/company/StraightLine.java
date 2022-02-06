package com.company;

public class StraightLine implements Borderable {
    public void draw() {
        System.out.println("Линия");
    }

    protected int x, y, z;
    protected int red, green, blue;
    protected int sizeBorderWidth;
    protected int sizeScale;
    protected String name;

    protected void setColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }



    @Override
    public void name(String name) {
        this.name=name;
    }

    @Override
    public void setBorderWidth(int sizeBorderWidth) {
        this.sizeBorderWidth = sizeBorderWidth;
    }

    @Override
    public void setScale(int sizeScale) {
        this.sizeScale = sizeScale;
    }
}

