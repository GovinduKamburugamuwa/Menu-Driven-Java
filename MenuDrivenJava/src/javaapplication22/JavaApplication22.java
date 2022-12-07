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
public class JavaApplication22 {

    
    static Employee e[]= new Employee[100];
    static int EmployeeCount;


    /**
     * @param args the command line arguments
     */
   public  static void mainmenu()
   {
       System.out.println("*************************************");
       System.out.println("* 1.Add new employee                *");
       System.out.println("* 2.Print all employee details      *");
       System.out.println("* 3.Print given employee detail     *");
       System.out.println("* 4.Exit                            *");
       System.out.println("*************************************");
   }
   
       public static void CallType()
    {
    int type = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Type : "); 
    System.out.println("1.Full Time Employee  2.Contractor  3.manager ");
    type = input.nextInt();
    switch(type)
    {
        case 1:
            e[EmployeeCount]= new FullTimeEmp();
            e[EmployeeCount].Input();
            EmployeeCount++;
            break;
        case 2:
            e[EmployeeCount]= new Contractor();
            e[EmployeeCount].Input();
            EmployeeCount++;
            break;
        case 3:
            e[EmployeeCount]= new Manager();
            e[EmployeeCount].Input();
            EmployeeCount++;
            break;
    }
    }
    public static void printAll()
    {
        for(int i=0;i<EmployeeCount;i++){
            
          e[i].print();      }
    }
       
    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeCount=0;
        /*Name obj = new Name();
        obj.InputFullName();
        Date obj1 = new Date();
        obj1.InputDate();
        Employee obj2 = new Employee(obj1,obj,123456);
        System.out.println(obj2);*/
        mainmenu();
        int option =0;
       do{
    Scanner input = new Scanner(System.in);
    System.out.print("Enter MenuDriven  option : ");   
    option = input.nextInt();
   
   switch(option)
   {
       case 1:
           System.out.println("***Add New Employee***");
           CallType();
           break;
       case 2:
           System.out.println("*******All Employee Detail*******");
           printAll();
           break;
       case 3:
           System.out.println("Given Detail");
           e[EmployeeCount].print();
           break;
       case 4:
           System.out.println("Exit");
           break;
       default:
           System.out.println("Invalid Option");
           break;
   }
       }while(option!=4);
 
       
        
    }
    
}
