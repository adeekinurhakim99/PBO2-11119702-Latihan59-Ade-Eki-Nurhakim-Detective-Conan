/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

/**
 *
 * @author Ekiw
 */
public class Circle {
    private double radius;
    private final double PI = 3.14159;
    
    public double calculateArea() {

        double area;

        area = (PI * radius * radius);

        return area;
    }
    public double calculateDiameter() {

        double diameter;

        diameter = (radius * 2);

        return diameter;

    }
    public double calculateCircumference() {

        double circumference;

        circumference = (2 * PI * radius);

        return circumference;

    }
    public void setRadius(double radius) {

        this.radius = radius;
    }
     public double getRadius() {

        return radius;
    }

}
}
