package com.workintech.HomeworkFirst;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow((x), 2) + Math.pow((y), 2));
    }

    public double distance(int a, int b) {
        return Math.sqrt(Math.pow((getX() - a), 2) + Math.pow((getY() - b), 2));
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
    }

}
