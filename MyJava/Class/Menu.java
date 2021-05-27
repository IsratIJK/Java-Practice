//Import Necessary package here
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Menu{ 
    Menu()
    {
    JFrame myframe; 
    myframe=new JFrame();
    myframe.setLayout(new BorderLayout());
    myframe.setTitle("Class Test!!!");
  
    myframe.setSize(200, 200); 
    JPanel center = new JPanel();
    center.setLayout(new GridLayout(3,3)); 
    JLabel cell1 = new JLabel("1");
    JLabel cell2 = new JLabel("2");
    JLabel cell3 = new JLabel("3");
    JLabel cell4 = new JLabel("4");
    JLabel cell5 = new JLabel("5");
    JLabel cell6 = new JLabel("6");
    center.add(cell1);
    center.add(cell2);
    center.add(cell3);
    center.add(cell4);
    center.add(cell5);
    center.add(cell6);


for(int i=0; i<9; i++){
       
    //    center.add(cell[i]);
      



   
    cell1.setFont(new Font("Cambria", 2, 24));
    cell2.setFont(new Font("Cambria", 2, 24));
    cell3.setFont(new Font("Cambria", 2, 24));
    cell4.setFont(new Font("Cambria", 2, 24));
    cell5.setFont(new Font("Cambria", 2, 24));
    cell6.setFont(new Font("Cambria", 2, 24));
    
    JPanel top = new JPanel(); 
    top.setLayout(new GridLayout());


    JButton b=new JButton("Change");
    JButton b1=new JButton("Reset");
    top.add(b);
    top.add(b1);


    //Add code for button Change and Reset and add to necessary panel
    myframe.add(top, BorderLayout.NORTH); 
    myframe.add(center, BorderLayout.CENTER);
    myframe.setVisible(true);
    }
    public static void main(String[] args) { 
    new Menu();
    }
}
