
//Sydney Povey
//Started Sept 23 2021. Finished Sept 24 2021.
//Code that calculates the surface area and the volume of a cylinder.
import javax.swing.JOptionPane;
import java.lang.Math;

public class Calculator {
    public static void main(String[] args){
        //Prompts user to input the radius and height of a cylinder.
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the cylinder:"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the cylinder:"));
        
        //This does the math to find the SA and V of the cylinder.
        double surfaceArea = 2* Math.PI * radius * height + 2 * Math.PI * radius*radius;
        double volume = Math.PI*radius*radius*height;
   
        //Displays the final answer.
        JOptionPane.showMessageDialog(null, "Surface Area: " + surfaceArea + "\n Volume: " + volume);
    }
}
