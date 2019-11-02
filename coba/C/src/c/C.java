/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;
import java.util.Scanner;
/**
 *
 * @author Ekiw
 */
public class C {
 public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        Circle circle1 = new Circle();
        circle1.setRadius(20);
        System.out.println("Enter the radius of a circle " + circle1.getRadius());
        System.out.println("Area = " + circle1.calculateArea());
        System.out.println("Diameter = " + circle1.calculateDiameter());
        System.out.println("Circumference = " + circle1.calculateCircumference());


    }

}