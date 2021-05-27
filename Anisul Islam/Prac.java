import javax.swing.*;
import java.awt.*;

class Test extends JFrame{
    Test(){
        setTitle("GRID");
        setSize(400,500);
        GridLayout lay=new GridLayout(3,4);//for creating gap: new Gridlayout(3,4,10,10)
        setLayout(lay);
   

        
        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("4"));
        add(new JButton("5"));
        add(new JButton("6"));
        add(new JButton("7"));
        setVisible(true);
    }
}
class Grid{
    public static void main(String[] args){
        new Test();
    }
}