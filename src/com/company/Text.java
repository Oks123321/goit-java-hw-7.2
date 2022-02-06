package com.company;


public class Text implements Scalable {
    protected int x, y, z;
    protected int red, green, blue;
    protected int sizeScale;
    protected String name;

    public void draw() {
        System.out.println("Текст");
    }
    @Override
    public void name(String name) {
        this.name=name;
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


