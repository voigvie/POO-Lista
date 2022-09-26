/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author giovanna
 */
public class Questao3 {
       public static void main(String[] args) {
              Locale.setDefault(Locale.US);
              Scanner sc = new Scanner(System.in);

              Employee emp = new Employee();

              System.out.print("Name: ");
              emp.setName(sc.nextLine());
              System.out.print("Gross salary: ");
              emp.setGrossSalary(sc.nextDouble());
              System.out.print("Tax: ");
              emp.setTax(sc.nextDouble());

              System.out.println();
              System.out.println("Employee: " + emp);
              System.out.println();
              System.out.print("Which percentage to increase salary? ");
              double percentage = sc.nextDouble();
              emp.increaseSalary(percentage);

              System.out.println();
              System.out.println("Updated data: " + emp);
              sc.close();
       }
}