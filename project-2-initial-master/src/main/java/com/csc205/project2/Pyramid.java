package com.csc205.project2;

public class Pyramid extends Shape {

    private double length;
    private double height;
    private double width;

    public Pyramid() {
        super();
        length = 0;
        height = 0;
        width = 0;
    }

    public Pyramid(Double l, double w, double h) {
        super();
        length = l;
        width = w;
        height = h;
    }

    public double getLength() {
        return length;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double surfaceArea() {
        return length * width + length * Math.sqrt(Math.pow((width / 2), 2) + Math.pow(height, 2)) + width * Math.sqrt(Math.pow((length / 2), 2) + Math.pow(height, 2)); //this was a headache, never use a pyramid
    }

    public double volume() {
        return (length * width * height) / 3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pyramid {");
        sb.append("length=").append(length);
        sb.append("width=").append(width);
        sb.append("height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
