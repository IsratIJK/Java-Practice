import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calc implements ActionListener{
    JFrame f;
    JButton b,r;
    JTextField tf;

    public Calc(){
        f=new JFrame("Converter");
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        
        f.add(new JLabel());
        tf=new JTextField(20);
        f.add(tf);
        
        b=new JButton("Count");
        r=new JButton("reset");
        f.add(b);
        f.add(r);

        b.addActionListener(this);
        r.addActionListener(this);

        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b)
        tf.setText(Double.parseDouble(tf.getText())*80+" "+"BDT");
        // else if (e.getSource()==r)
        // tf.setText("0");
    }
    public static void main(String[] args){
        new Calc();
    }

    }




