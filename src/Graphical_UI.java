import javax.swing.JOptionPane;
public class Graphical_UI {
	public static void main(String []args) {
	for (int i = 0 ; i<3; i++) {
	String first = JOptionPane.showInputDialog("Enter first number: ");
	String second = JOptionPane.showInputDialog("Enter second number: ");
	
	int one = Integer.parseInt(first);
	int two = Integer.parseInt(second);
	int sum = one + two;
	
	
	JOptionPane.showMessageDialog(null, "The sum is " +sum,"Sum Box" ,JOptionPane.PLAIN_MESSAGE );
	}
	String firstt = JOptionPane.showInputDialog("Enter first name: ");
	String secondd = JOptionPane.showInputDialog("Enter second name: ") ;
	
	String summ = firstt + " " + secondd;
	
	JOptionPane.showMessageDialog(null, "Your name is " +summ, "Sum Box" ,JOptionPane.PLAIN_MESSAGE );
	
	}
}
