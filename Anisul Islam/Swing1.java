import javax.swing.JFrame;
public class Swing1 extends JFrame{

    Swing1(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.setSize(400,400);
        setBounds(200,300,400,400);
        setResizable(false);
        setTitle("Ipty");
        @Overide
        

    }
    public static void main(String[] args){
        Swing1 f=new Swing1();
        
    }
}
