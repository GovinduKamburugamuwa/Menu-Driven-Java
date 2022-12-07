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
public class Employee  {
    Date date;
    Name name;
    int NIC;

    public Employee() {
        this.date = new Date();
        this.name = new Name();
        this.NIC = 0;
    }
    
    

    public Employee(Date date, Name name, int NIC) {
        this.date = date;
        this.name = name;
        this.NIC = NIC;
    }
 

public  void Input()
{
    System.out.println("**************************");
    System.out.println("* Enter Employee Detail  *");
    name.InputFullName();
    date.InputDate();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter NIC :");
    NIC=input.nextInt();
}

 public String toString(){
     return this.name+" "+this.date+" "+this.NIC;
 }   

 public void print(){
     System.out.println("Name : "+name);
     System.out.println("DOB : "+date);
     System.out.println("NIC : "+NIC);
             
 }

    
}
