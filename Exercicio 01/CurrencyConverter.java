/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author giovanna
 */
class CurrencyConverter {
       static double getIOF(double amount) {
              return amount * (0.06);
       }

       static double dollarToReal(double amount, double dollarPrice) {
              double convertedAmount = amount * dollarPrice;
              return (convertedAmount) + getIOF(convertedAmount);
       }
}

