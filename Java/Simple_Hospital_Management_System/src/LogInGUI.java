import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import net.miginfocom.swing.MigLayout;


public class LogInGUI implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JTextField username;
	private JPasswordField password;
	private JLabel user;
	private JLabel pass;
	private JButton Enter;
	private JButton Back;
	private String FileName;
	

	public LogInGUI(String s) {
		FileName = s;
		frame = new JFrame("Log in");
		panel = new JPanel();
		user = new JLabel("Username");
		username = new JTextField();
		pass = new JLabel("Password");
		password = new JPasswordField();
		
		Enter = new JButton("Enter");
		Enter.addActionListener(this);
		Back = new JButton("Back");
		Back.addActionListener(this);
		
		panel.setLayout(new MigLayout());
		panel.add(user);
		panel.add(username,"wrap,growx");
		panel.add(pass);
		panel.add(password,"wrap,growx");
		panel.add(Enter,"skip,split2");
		panel.add(Back);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocation(500,500);
		frame.setSize(300,150);
		frame.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== Enter){
			File f = new File(FileName);
			try {
				Scanner sc = new Scanner(f);
				while(sc.hasNextLine()){
					String d = sc.nextLine();
					String [] ar = d.split(" ");
					if(ar[0].equals(username.getText()) && ar[2].equals( password.getText()) && FileName == "Admin.txt"){
						System.out.println("Welcome admin "+ar[1]+"!!");
						frame.dispose();
						new AdminGUI();
					}
					else if(ar[0].equals(username.getText()) && ar[2].equals( password.getText()) && FileName == "Manager.txt"){
						System.out.println("Welcome Manager "+ar[1]+ "!!");
						frame.dispose();
						new ManagerGUI();
					}
					else if(FileName == "Doctor.txt"){
						frame.dispose();
						new DoctorGUi();
					}
					else if(FileName == "Patient.txt"){
						frame.dispose();
						new PatientGUI();
					}
					/*else{
						System.out.println("Incorrect login details!!!");
					}*/
				}
				
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			}
		
		else{
			frame.dispose();
			new MainGUI();
		}
		
	}

}
