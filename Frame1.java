import java.awt.*;
import java.awt.event.*;

    public class Frame1 implements WindowListener {
        private Frame f;
        private Panel p;

        public Frame1(){
            f = new Frame ("Frame title");
            p = new Panel();
        }
        public void launchFrame(){
            f.addWindowListener(this);
            f.setSize(400,400);
            f.setBackground(Color.red);
            f.setLayout(null);
            
            p.setSize(500,500);
            p.setBackground(Color.green);
            
            f.add(p);
            f.setVisible(true);
        }
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
        public void windowOpened(WindowEvent e){}
        public void windowIconified(WindowEvent e){}
        public void windowDeiconified(WindowEvent e){}
        public void windowClosed(WindowEvent e){}
        public void windowActivated(WindowEvent e){}
        public void windowDeactivated(WindowEvent e){}


        public static void main(String[] args){
            Frame1 fp=new Frame1();
            fp.launchFrame();
        }
}

