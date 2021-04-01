/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.mycput.adpgroupassementproject;

/**
 *
 * @author NomthaMquqo
 */
public class Circle {
    double radius;
    double y;
    double x;

    public Circle() {
    }

    public Circle(double radius, double y, double x) {
        this.radius = radius;
        this.y = y;
        this.x = x;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", y=" + y + ", x=" + x + '}';
    }
    
    
}
