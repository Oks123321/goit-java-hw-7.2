package com.company;

public abstract class Shape implements Borderable {
    protected int x, y, z;
    protected int red, green, blue;
    protected int sizeScale;
    protected int sizeBorderWidth;
    protected String name;

    protected abstract void setCoordinates(int x, int y, int z);

    protected abstract void setColor(int red, int green, int blue);

    protected abstract void setBorderColor(int red, int green, int blue);

    public void draw() {
        System.out.println("Фигура");
    }

    @Override
    public void name(String name) {
        this.name=name;
    }

    @Override
    public void setScale(int sizeScale) {
        this.sizeScale = sizeScale;
    }

    @Override
    public void setBorderWidth(int sizeBorderWidth) {
        this.sizeBorderWidth = sizeBorderWidth;
    }
}




