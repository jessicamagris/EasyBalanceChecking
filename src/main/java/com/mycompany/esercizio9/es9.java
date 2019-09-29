/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esercizio9;
import java.util.Arrays;
/**
 *
 * @author jessi
 */
public class es9 {
    

/**
 *
 * @author jessi
 */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cB= "1000.00\n"
                + "125 Market 125.45\n"
                + "126 Hardware 34.95\n"
                + "127 Video 7.45\n"
                + "128 Book 14.32\n"
                + "129 Gasoline 16.10\n";

        
        System.out.println(EasyBalanceChecking(cB));
    }
    public static String EasyBalanceChecking(String cB){
                
        
        String[]lines =cB.split("\n");
        double balance= Double.parseDouble(lines[0]);
        double sum = 0.0;
        //System.out.println(balance);
        String[] line;
        StringBuilder out= new StringBuilder();
        out.append("Original Balance: "+sistemaDouble(balance)).append("\n");
        for (int i = 1; i < lines.length; i++) {
            line = lines[i].split(" ");
            //System.out.println(balance);
            //System.out.println(Double.parseDouble(line[2]));
            //System.out.println(Double.sum(balance, 0.0 -Double.parseDouble(line[2])));
            sum += Double.parseDouble(line[2]);
            out.append(line[0]).append(" ").append(line[1].replaceAll("[^\\p{L}\\p{Z}]", "")).append(" ").append(line[2]).append(" Balance ").append(sistemaDouble(balance = Double.sum(balance,-Double.parseDouble(line[2])))).append("\n");
            //System.out.println(Arrays.toString(line));
        }
        out.append("Total expence: ").append(sistemaDouble(sum)).append("\n");
        out.append("Average expence: ").append(sistemaDouble(sum/lines.length-1));
        return out.toString();
    }
    private static double sistemaDouble(double d){
        int i =(int) Math.round(d*100);
        d=((double)i)/100;
        return d;
    }    
}

