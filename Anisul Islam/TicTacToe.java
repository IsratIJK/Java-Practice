

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TicTacToe implements ActionListener{
    JFrame frame;
    JButton a,b,c,d,e,f,g,h,i;
    JTextField tf;
 

    public TicTacToe(){
        frame=new JFrame("Tic Tac Toe");
        frame.setLayout(new GridLayout(3,3));
        frame.setSize(300,300);


       a=new JButton();
        b=new JButton();
        c=new JButton();
        d=new JButton();
        e=new JButton();
        f=new JButton();
        g=new JButton();
        h=new JButton();
        i=new JButton();
         
        f.add(a);
        f.add(b);
        f.add(c);
        f.add(d);
        f.add(e);
        f.add(f);
        f.add(g);
        f.add(h);
        f.add(i);


        a.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        e.addActionListener(this);
        f.addActionListener(this);
        g.addActionListener(this);
        h.addActionListener(this);
        i.addActionListener(this);

        frame.setVisible(true);
        tf=new JTextField();
        f.add(tf);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==a && e.getSource()==b && e.getSource()==c)
        tf.setText("Win");
        else if(e.getSource()==d && e.getSource()==e && e.getSource()==f)
           tf.setText("Win");
      
            }
        

    
    public static void main(String[] args){
        new TicTacToe();
    }

}

