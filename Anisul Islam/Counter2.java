import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Counter2 implements ActionListener{
 JFrame f;
 JTextField tf;
 JButton b,r;

   public Counter2(){
        f=new JFrame("Counter");
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.add(new JLabel("Counter"));
        tf=new JTextField(10); 
        f.add(tf);
        tf.setText("0");
        b=new JButton("Strt");
        r=new JButton("reset");
        f.add(b);
        f.add(r);

        b.addActionListener(this);
        r.addActionListener(this);

        f.setVisible(true);
    }
    
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==b)
            tf.setText(Integer.parseInt(tf.getText())+1+"");
            else if (e.getSource()==r)
            tf.setText("0");
        }
     

    public static void main(String[] args){
        new Counter2();
    }
}
