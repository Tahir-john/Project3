import javax.swing.*;
import java.awt.event.*;
class EventHandling{
public static void main(String args[]){
JFrame frame=new JFrame("Event Example");
frame.setSize(300,200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JButton button=new JButton("Click Me!!");
JLabel label=new JLabel("Button not clicked yet.");
button.addActionListener(new ActionListerner(){
public void actionPerformed(ActionEvent e){
label.setText("Button was clicked!");
}
});
JPanel panel=new JPanel();
panel.add(button);
panel.add(label);
frame.add(panel);
frame.setVisible(true);
}
}
