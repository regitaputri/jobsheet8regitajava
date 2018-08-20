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
public class Huruf5I {
    public static void main(String[] args) {
        
        int i, j;
        
        for(i=0;i<=11;i++)
        {
            for(j=0;j<=6;j++)
            {
                if(i>=0 && i<2 || i>=2 && i<9 && j==3 || i>9 && i<=11)
                {
                    System.out.printf("**");
                }
                else
                {
                    System.out.printf("  ");//three spaces
                }
            }
            
            System.out.print("\n");
                }
                }
        }
