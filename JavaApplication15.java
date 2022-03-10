/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;
import java.util.Scanner;
/**
 *
 * @author Guiller
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner bibiboy = new Scanner(System.in);
        String ans;
       do {
        System.out.print(" 1 Rectangle");
        System.out.print(" 2 circle");
        System.out.print(" 3 Cylinder");
        System.out.print("Choose the shape you want: ");
        int choice = bibiboy.nextInt();
        
        switch(choice) {
            case 1:
                do {
                    System.out.println("Rectangle");
                    System.out.print("Enter the length of the rectangle: ");
                    double Length = bibiboy.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double Width = bibiboy.nextDouble();
                    
                    double Area = Length * Width;
                    double Perimeter = 2 * (Length + Width);
                    System.out.println("The area of the rectangle is " + Area);
                    System.out.println("The perimeter of the rectangle is " + Perimeter);
                    
                    System.out.print("do you want to try again? yes or no: ");
                    ans = bibiboy.next();
                }
                    while (ans.equalsIgnoreCase("YES"));
                    break;    
                    
                    
            case 2:
                do {
                    System.out.println("circle");
                    System.out.print("Enter the radius of the Circle: ");
                    double Radius = bibiboy.nextDouble();
                    
                    double area = Math.PI * (Radius * Radius);
                    System.out.println("The area of the circle is " + area);
                    double circumference = Math.PI * 2 * Radius;
                    System.out.println("The circumference of the circle is " + circumference);
                     System.out.print("do you want to try again? yes or no: ");
                    ans = bibiboy.next();
                }
                    while (ans.equalsIgnoreCase("YES"));
                    break;
               
                    
            case 3:
                do {
                    System.out.println("Cylinder");
                    System.out.print("Enter the raidus of the cylinder: ");
                    double radiuss = bibiboy.nextDouble();
                    System.out.print("Enter the height of the cylinder: ");
                    double heightt = bibiboy.nextDouble();
                    
                    double PI = 3.1416;
                    double surface = (2 * PI * radiuss*(radiuss+heightt));
                    double volume = Math.PI * radiuss * radiuss * heightt;
                    System.out.println("The Surface area of a Cylinder is " +( surface));
                    System.out.println(" The Volume of a Cylinder is " + (volume));
                    
                    System.out.print("do you want to try again? yes or no: ");
                    ans = bibiboy.next();
                }
                    while (ans.equalsIgnoreCase("YES"));
                    break;
        }
    System.out.print("do you want to go back from the start? yes or no: ");
                    ans = bibiboy.next();
       }
                    while (ans.equalsIgnoreCase("YES"));
                    
                              
             
}
}
           
                 
             
                   
       

            
          
       
       
       
        
