/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NamaSaya;

/**
 *
 * @author ASUS
 */
public class Huruf1P {
    public static void main(String[] args) {
        int i, j, k;
        for(i=0;i<=11;i++)
        {
        
        for(j=0;j<=2;j++)
        {
        System.out.printf("*");
        }
        
        for(k=1;k<=5;k++)
        {
        if(i>=0 && i<2 || i>4 && i<7 || i>=2 && i<=4 && k==5)
        {
            System.out.printf("**");
        }
        else
        {
                System.out.printf("  ");//two spaces
                }
        }
        System.out.printf("\n");
        }
    }
}