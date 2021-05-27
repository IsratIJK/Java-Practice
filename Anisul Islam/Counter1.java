import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Counter1 implements ActionListener{
 JFrame f;
 JTextField tf;

   public Counter1(){
        f=new JFrame("Counter");
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.add(new JLabel("Counter"));
        tf=new JTextField(10); 
        f.add(tf);
        tf.setText("0");
        JButton b=new JButton("Strt");
        f.add(b);

        b.addActionListener(this);

        f.setVisible(true);
    }
    
        public void actionPerformed(ActionEvent e){
            tf.setText(Integer.parseInt(tf.getText())+1+"");
        }
    

    public static void main(String[] args){
        new Counter();
    }
}
