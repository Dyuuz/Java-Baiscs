package JavaSwing;
import java.awt.event.*;
import javax.swing.*;

public class FrameTest {
	public static void main(String []args) {
		JFrame J = new JFrame("Frame Test");
		JButton Launch = new JButton(new ImageIcon("C:\\a.png"));
		final JTextField Tf = new JTextField();
		Tf.setBounds(200, 130,180,100);
		Launch.setBounds(70, 10, 100, 100);
		JButton Launch1 = new JButton(new ImageIcon("C:\\a_profile.png"));
		Launch1.setBounds(200, 10, 100, 100);
		JButton neww = new JButton(new ImageIcon("C:\\b.png"));
		neww.setBounds(70, 130, 100, 100);
		neww.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent e) {
			 Tf.setText("Black box button was clicked");
		 }
		});
		Launch.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
				 Tf.setText("Send box button was clicked");
			 }
			});
		Launch1.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
				 Tf.setText("Flames box button was clicked");
			 }
			});
		J.add(Tf);
		J.add(Launch);
		J.add(Launch1);
		J.add(neww);
		J.setSize(500, 500);
		J.setLayout(null);
		J.setVisible(true);
//		JOptionPane.showMessageDialog(J ,"Guess Game" ,JOptionPane.PLAIN_MESSAGE);
	}
}
