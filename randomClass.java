import java.util.Random;
import java.lang.Integer; 

import javax.swing.JOptionPane;
public class randomClass {
    public static void main(String[] args) {
        boolean chek=false;
        Random generate=new Random();
        int randomNumber;
        int ownNumber;
        int favouriteNumber;
        JOptionPane j= new JOptionPane();
        ownNumber=Integer.parseInt(j.showInputDialog("Enter your prefered number between 10 and 20"));
        if(ownNumber>=10 && ownNumber<=20){
            favouriteNumber=ownNumber;

        }
        else {

            j.showMessageDialog(null," by default you chose 10\nplease enter the number between 10 and 20 on next time yoy run the code");
            favouriteNumber=10;
        }
        
        
    
            j.showMessageDialog(null,"your favourite number is"+favouriteNumber);
            randomNumber=generate.nextInt(10,20);
            j.showMessageDialog(null,"Random number is "+randomNumber);
        
            if(randomNumber==favouriteNumber){
                j.showMessageDialog(null,"You Have Win!!");
            }
            else
            {
                j.showMessageDialog(null,"You loose Please try again dear");
            }
           


       
        }
        
                   
    
    
}
