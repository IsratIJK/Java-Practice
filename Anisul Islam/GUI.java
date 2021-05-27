import javax.swing.*;
public class GUI{
    public static void main(String[] args){
        JFrame f=new JFrame();
        f.setSize(400,500);
        JPanel p=new JPanel();
        //p.setBackground(Color.RED);

        JButton b=new JButton("OK");
        p.add(b);
        
        f.add(p);
        f.setVisible(true);
    }
}
