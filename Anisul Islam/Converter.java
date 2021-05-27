import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class CurrencyConvert {
 CurrencyConvert() {
 JFrame frame = new JFrame("Currecny");
 frame.setLayout(new FlowLayout());
 frame.setSize(320, 300);
 JLabel label, label1;
 JTextField textField; label = new JLabel("Enter Currency in USD : ");
 textField = new JTextField(12);
 label1 = new JLabel();
 JButton btn = new JButton("Convert");
 btn.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
 label1.setText(Double.parseDouble(textField.getText()) * 80 + 
" " + "BDT");
 }
 });
 frame.add(label);
 frame.add(textField);
 frame.add(label1);
 frame.add(btn);
 frame.setVisible(true);
 
frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 }
}
public class Converter { public static void main(String[] args) {
 new CurrencyConvert();
 }
}

