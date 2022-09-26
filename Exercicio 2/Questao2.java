/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author giovanna
 */
public class Questao2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        
        Rectangle rect = new Rectangle(width, height);
        
        System.out.printf("AREA = %.2f%n", rect.getArea());
        System.out.printf("PERIMETER = %.2f%n", rect.getPerimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.getDiagonal());
        sc.close();
    }
}
