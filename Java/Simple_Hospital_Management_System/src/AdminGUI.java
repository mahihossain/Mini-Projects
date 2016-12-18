import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;


public class AdminGUI implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JComboBox options;
	private JButton ok;
	private JButton back;

	public AdminGUI(){
		frame = new JFrame("Welcome admin");
		String option[] = {"Add manager","Add doctor","Add patient",
							"Delete manager","Delete patient","Delete Doctor"
							};
		options = new JComboBox(option);
		panel = new JPanel();
		ok = new JButton("Ok");
		ok.addActionListener(this);
		back = new JButton("Back");
		back.addActionListener(this);
		
		panel.setLayout(new MigLayout());
		panel.add(options,"wrap,skip");
		panel.add(ok,"skip,split2");
		panel.add(back);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		frame.setLocation(400,400);
		frame.setSize(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ok){
			Operations o = new Operations();
			
			if(options.getSelectedItem().toString() == "Delete manager"){
				frame.dispose();
				o.DeleteManager();
			}
			else if(options.getSelectedItem().toString() == "Add manager"){
				frame.dispose();
				o.CreateManager();
			}
			else if(options.getSelectedItem().toString() == "Add doctor"){
				frame.dispose();
				o.AddDoc();
			}
			else if(options.getSelectedItem().toString() == "Delete Doctor"){
				frame.dispose();
				o.DeleteDoc();
			}
			else if(options.getSelectedItem().toString() == "Add patient"){
				frame.dispose();
				o.AddPatient();
			}
			else if(options.getSelectedItem().toString() == "Delete patient"){
				frame.dispose();
				o.DeletePatient();
			}
			
		}
		else if(e.getSource() == back){
			frame.dispose();
			new LogInGUI("Admin.txt");
		}
		
	}
	
		

}
