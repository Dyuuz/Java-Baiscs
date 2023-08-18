import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PopupMEnu {
	public static void main(String[] args) {
		JFrame f = new JFrame("Popup Menu");
		JPopupMenu pop = new JPopupMenu();
		JMenuItem cut = new JMenuItem("Cut");
		JMenuItem copy = new JMenuItem("Copy");	
		JMenuItem paste = new JMenuItem("Paste");
		
		f.add(pop);
		pop.add(cut);
		pop.addSeparator();
		pop.add(copy);
		pop.addSeparator();
		pop.add(paste);
		
		f.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				pop.show(f, e.getX(),e.getY());
				
			}
			});
		f.setSize(800, 800);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}