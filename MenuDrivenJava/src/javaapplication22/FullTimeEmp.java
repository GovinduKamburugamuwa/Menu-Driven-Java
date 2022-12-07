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
public class FullTimeEmp extends Employee {
    
    private float salary;

    public FullTimeEmp() {
        super();
        this.salary = 0.0f;
        
    }

    

    public FullTimeEmp(float salary, Date date, Name name, int NIC) {
        super(date, name, NIC);
        this.salary = salary;
    }
    
    
    
   public void Input()
   {
       super.Input();
       Scanner input = new Scanner(System.in);
       System.out.println("Enter Salary :");
       salary = input.nextFloat();
       
   }
    
   public void print()
{
    System.out.println("**************************");
    super.print();
    System.out.println("The Salary:"+salary);
    System.out.println("**************************");
    
}
   
    
    
}
