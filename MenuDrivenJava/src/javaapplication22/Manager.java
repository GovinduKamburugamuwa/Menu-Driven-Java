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
public class Manager extends FullTimeEmp {
    
    public String ComCar;
    public int phone;

    public Manager() {
    }
    

    public Manager(String ComCar, int phone, float salary, Date date, Name name, int NIC) {
        super(salary, date, name, NIC);
        this.ComCar = ComCar;
        this.phone = phone;
    }

       public void Input()
   {
       super.Input();
       Scanner input = new Scanner(System.in);
       System.out.println("Enter Company Car Type :");
       ComCar = input.nextLine();
       System.out.println("Enter Phone Number :");
       phone = input.nextInt();
       
       
   }

    public void print()
{
    System.out.println("**************************");
    super.print();
    System.out.println("The Company Car Type  :"+ComCar);
    System.out.println("The Phone Number      :"+ComCar);
    System.out.println("**************************");
    
    
    
    
}
    
    
    
    
    
    
    
    
    
}
