import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class UpDown extends JFrame {
private JTextField both;
private JButton upCounter , downCounter , reset;
private Container c;
public UpDown(){
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setTitle("Counter");
setBounds(0,0,500,250);
c = getContentPane();
c.setLayout(null);
both = new JTextField("0");
both.setBounds(200,5,100,50);
c.add(both);
upCounter = new JButton("UP");
upCounter.setBounds(90,60,100,50);
c.add(upCounter);
downCounter = new JButton("Down");
downCounter.setBounds(200,60,100,50);
c.add(downCounter);
reset = new JButton("Reset");
reset.setBounds(310,60,100,50);


// add necessary code here.
}
class actionHandler implements ActionListener {
public void actionPerformed(ActionEvent e){
    
// add necessary code here.
}
}
public static void main(String[] args) {
// add necessary code here.
}
}
3. Suppose, four friends Dustin, Mike, Lucas and Eleven are on a mission of rescuing their fifth friend
Will from the monster named, Demogorgon and its fellow monster gang.
Class Friend implements Runnable{
// Write your code here
}

