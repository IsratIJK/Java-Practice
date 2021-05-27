import javax.swing.JFrame;
public class Swing extends JFrame{
    public static void main(String[] args){
        Swing f=new Swing();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // f.setSize(400,400);
        f.setBounds(200,300,400,400);
        f.setResizable(false);
        
        
    }
}