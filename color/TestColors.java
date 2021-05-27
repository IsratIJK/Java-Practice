

import java.awt.*;
import java.awt.event.*;

public class TestColors implements WindowListener, ActionListener {
    private Frame f;
    private Button b;
    
    public TestColors(){
        f = new Frame("Iptu's mood swing");
        b = new Button("Change the color");
        b.setActionCommand("z"); 
    }
    
    public void frame(){
        b.addActionListener(this);
        b.setForeground(Color.MAGENTA);
        b.setBackground(Color.WHITE);
        
        f.add(b);
        
        f.addWindowListener(this);
        
        f.setSize(500,500);
        f.setBackground(Color.green);
        f.setLayout(new FlowLayout());
        
        f.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent v){
        
        int r, g, b;

        if(v.getActionCommand()  == "z")
        {
            r = (int)(Math.random()*255);
            g = (int)(Math.random()*255);
            b = (int)(Math.random()*255);
            Color c = new Color(r, g, b);
            f.setBackground(c);
        }
    }
    
    public void windowClosing(WindowEvent v){
        System.exit(0);
    }
    
    public void windowOpened(WindowEvent v){};
    public void windowIconified (WindowEvent v){};
    public void windowDeiconified (WindowEvent v) {};
    public void windowClosed (WindowEvent v){};
    public void windowActivated(WindowEvent v) {};
    public void windowDeactivated(WindowEvent v){};
    
    
    
    
    
    
    public static void main(String[] args){
    TestColors p = new TestColors();
    p.frame();
    }
    
    
    
}

