import javax.swing.*;
import java.awt.*;
// 56 --> paquetes e importaciones

public class Tester {
    public static void main (String[] args) {
        JFrame frame = new JFrame ("Hello, world!");
//        JLabel label = new JLabel ("Hello, world!",JLabel.CENTER);
        frame.add (new HelloComponent()); // add the new text in the window
        frame.setSize (300, 300);
        frame.setVisible (true);
    }
}

// now there is the class that draws the text inside the window.
class HelloComponent extends JComponent {
    public void paintComponent(Graphics g) { // component method
        g.drawString("Hello, Java", 125, 125);
    }
}
