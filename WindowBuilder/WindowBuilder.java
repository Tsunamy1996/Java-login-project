import javax.swing.*;
import java.awt.Color;
import helper_classes.*;

public class WindowBuilder {
  public static void main(String[] args) {

     JFrame frame = new JFrame("My Awesome Window");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(665, 358);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#f4c064"));

     JPasswordField element1 = new JPasswordField("");
     element1.setBounds(228, 179, 193, 21);
     element1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element1.setBackground(Color.decode("#ffe7bf"));
     element1.setForeground(Color.decode("#73664e"));
     element1.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element1, "Your Password!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element1);

     JTextField element3 = new JTextField("");
     element3.setBounds(228, 122, 190, 21);
     element3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element3.setBackground(Color.decode("#ffe7bf"));
     element3.setForeground(Color.decode("#73664e"));
     element3.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element3, "Your Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element3);

     JButton element4 = new JButton("Log in");
     element4.setBounds(536, 268, 106, 30);
     element4.setBackground(Color.decode("#bca8e4"));
     element4.setForeground(Color.decode("#000"));
     element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element4.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     element4.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element4, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(element4);

     JLabel element5 = new JLabel("Username");
     element5.setBounds(151, 125, 106, 18);
     element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element5.setForeground(Color.decode("#000"));
     panel.add(element5);

     JLabel element6 = new JLabel("Password");
     element6.setBounds(153, 181, 106, 18);
     element6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element6.setForeground(Color.decode("#000"));
     panel.add(element6);

     JLabel element7 = new JLabel("Inserisci username e password, dopo premi il pulsante log in");
     element7.setBounds(134, 63, 426, 42);
     element7.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element7.setForeground(Color.decode("#000"));
     panel.add(element7);

     frame.add(panel);
     frame.setVisible(true);

  }
}