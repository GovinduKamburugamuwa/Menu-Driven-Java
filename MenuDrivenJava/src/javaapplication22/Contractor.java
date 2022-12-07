/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Scanner;

/**
 *
 * @author MAX
 */
public class Contractor extends Employee {
    public float HR;

    public Contractor() {
        super();
    }
    
    public Contractor(float HR, Date date, Name name, int NIC) {
        super(date, name, NIC);
        this.HR = HR;
    }
    
       public void Input()
   {
       super.Input();
       Scanner input = new Scanner(System.in);
       System.out.println("Enter Hourly Rate :");
       HR = input.nextFloat();
       
   }
    
          public void print()
{
    System.out.println("**************************");
    super.print();
    System.out.println("The Hourly Rate  :"+HR);
    System.out.println("**************************");
    
    
    
    
}
    
  
   
   
    
}
