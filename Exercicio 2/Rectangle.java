/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author giovanna
 */
public class Rectangle {
    double width;
    double heigth;
    
    Rectangle(double width, double heigth) {
      this.width = width;
      this.heigth = heigth;
    }
 
    double getArea() {
        return width * heigth;
    }
    
    double getPerimeter() {
        return ((width * 2) + (heigth * 2));
    }
    
    double getDiagonal() {
     double base = pow(width, 2);
     double altura = pow(heigth, 2);
     double s = base + altura;
     return sqrt(s);
    }
}