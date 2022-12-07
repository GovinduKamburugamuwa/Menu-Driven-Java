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
public class Date {
    
    
    int day;
    int month;
    int year;

    public Date() {
        this.day = 0;
        
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
   public Date(Date date){
       this.day = date.day;
       this.month =date.month;
       this.year = date.year;
   }

    public void InputDate()
    {
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Day :");
        this.day = input2.nextInt();
        System.out.println("Enter Month :");
        this.month = input2.nextInt();
        System.out.println("Enter Year :");
        this.year = input2.nextInt();  
    }    

    @Override
    public String toString() {
        return ("The Date :"+this.day+" "+this.month+" "+this.year);
    }
    
    
    
    
}
