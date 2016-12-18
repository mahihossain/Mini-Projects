import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;


public class MainGUI implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JComboBox ComboBox;
	private JLabel text;
	private JButton ok;
	private JButton cancel;

	public MainGUI() {
		frame = new JFrame("Welcome!!!");
		panel = new JPanel();
		String [] options = {"Admin","Manager","Doctor","Patient"};
		ComboBox = new JComboBox(options);
		text = new JLabel("Select your suitable option");
		ok = new JButton("Ok");
		ok.addActionListener(this);
		cancel = new JButton("Cancel");
		cancel.addActionListener(this);
		
		panel.setLayout(new MigLayout());
		panel.add(text,"wrap");
		panel.add(text,SwingConstants.CENTER);
		panel.add(ComboBox,"wrap");
		panel.add(ok,"split2");
		panel.add(cancel);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocation(500,500);
		frame.setSize(400,300);
		frame.pack();
		frame.setVisible(true);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ok){
			if (ComboBox.getSelectedItem() == "Admin" ){
				System.out.println("Admin");
				LogInGUI lg = new LogInGUI("Admin.txt");
				frame.dispose();
			}
			else if (ComboBox.getSelectedItem() == "Manager" ){
				System.out.println("Manager");
				LogInGUI lg = new LogInGUI("Manager.txt");
				frame.dispose();
			}
			else if (ComboBox.getSelectedItem() == "Doctor" ){
				System.out.println("Doctor");
				new DoctorGUi();
				frame.dispose();
			}
			else{
				System.out.println("Patient");
				frame.dispose();
				new PatientGUI();
			}
					
		}
		else{
			System.exit(0);
		}
		
	}
	
	public static void main(String[]args){
		new MainGUI();
		
	}

}
