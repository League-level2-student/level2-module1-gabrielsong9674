package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.createUI();
		 names = new ArrayList<String>();
		 names.add("Bob Banders ");
		 names.add("Sandy Summers ");
		 names.add("Greg Ganders ");
		 names.add("Donny Doners ");
	}
	static ArrayList<String> names;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton buttonAdd = new JButton();
	JButton buttonView = new JButton();
	public void createUI() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.add(panel);
		panel.add(buttonAdd);
		buttonAdd.setText("Add Name");
		buttonAdd.addActionListener(this);
		panel.add(buttonView);
		buttonView.setText("View Names");
		buttonView.addActionListener(this);
	}
	String lists = "Names: ";
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == buttonAdd) {
			String input = JOptionPane.showInputDialog("Enter a name");
			names.add(input+" ");
		}if(buttonPressed == buttonView) {
			for(String s: names) {
				String guests = s;
				lists = lists + guests;
			}
			JOptionPane.showMessageDialog(null, lists);
			
			
		}
	}
}
