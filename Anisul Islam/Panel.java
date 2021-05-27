import javax.swing.*;
import java.awt.*;
public class Panel{
    public static void main(String[] args){
        JFrame f=new JFrame("AWT Test");
        f.setSize(300,400);


        JPanel p1=new JPanel();
        JPanel p2=new JPanel();


        JLabel l1=new JLabel("Label1");

        JTextField tf1=new JTextField(15);

        JButton b1=new JButton("Button1");
        JButton b2=new JButton("Button2");

        p1.setBackground(Color.RED);
        p2.setBackground(Color.ORANGE);
    
        p1.add(l1);
        p1.add(tf1);

        p2.add(b1);
        p2.add(b2);

        f.add(p1);
        f.add(p2);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        
          


    }
}
