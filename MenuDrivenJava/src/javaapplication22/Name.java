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
public class Name {
    public String FN;
    public String MN;
    public String LN;

    public Name() {
        this.FN ="";
         this.MN ="";
          this.LN ="";
    }

    public Name(String FN, String MN, String LN) {
        this.FN = FN;
        this.MN = MN;
        this.LN = LN;
    }
    
     public Name(Name name) {
        this.FN = name.FN;
        this.MN = name.MN;
        this.LN = name.LN;
    }
    
    public void InputFullName()
    {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Firt Name :");
        this.FN = input1.nextLine();
        System.out.println("Enter Midlle Name :");
        this.MN = input1.nextLine();
        System.out.println("Enter Last Name :");
        this.LN = input1.nextLine();  
    }
    public String toString()
    {
        return(this.FN+" "+this.MN+" "+this.MN);
    }

    
}
