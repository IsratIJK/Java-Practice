//Import Necessary package here
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Menu { 
    Menu()
    {
    JFrame myframe; 
    myframe=new JFrame();
    myframe.setLayout(new BorderLayout());
    myframe.setTitle("Class Test!!!");
  
    myframe.setSize(200, 200); 
    JPanel center = new JPanel();
    center.setLayout(new GridLayout(3,3)); 
    JLabel cell[] = new JLabel[9];
    JButton button = new JButton();
    for(int i=0; i<9; i++){
       // add.button("i");


   
    cell[i].setFont(new Font("Cambria", 2, 24));
    }
    JPanel top = new JPanel(); 
    top.setLayout(new GridLayout());
    JButton b=new JButton("Change");
    JButton b1=new JButton("Reset");
    center.add(b);
    center.add(b1);


    //Add code for button Change and Reset and add to necessary panel
    myframe.add(top, BorderLayout.NORTH); 
    myframe.add(center, BorderLayout.CENTER);
    myframe.setVisible(true);
    }
    public static void main(String[] args) { 
    new Menu();
    }
}
