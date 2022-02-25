package com.csc205.project2;

public class Cylinder extends Shape {

    private double height;
    private double radius;

    public Cylinder() {
        super();
        height = 0.0;
        radius = 0.0;
    }

    public Cylinder(double h, double r) {
        super();
        height = h;
        radius = r;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double h) {
        height = h;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double surfaceArea() {
        return 2.0 * Math.PI * radius * height + 2.0 * Math.PI * Math.pow(radius, 2);
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height);
        sb.append("radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

}
