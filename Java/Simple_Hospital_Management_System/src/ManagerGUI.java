import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;


public class ManagerGUI implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JLabel choise;
	private JComboBox options;
	private JButton ok;
	private JButton back;

	public ManagerGUI() {
		frame = new JFrame("Welcome manager!!!");
		panel = new JPanel();
		choise = new JLabel("What do you want to do?");
		String [] option = {"Add Patient","Delete Patient",
							"View Patient","View Doctor",
							};
		options = new JComboBox(option);
		ok = new JButton("Ok");
		ok.addActionListener(this);
		back = new JButton("Back");
		back.addActionListener(this);
		
		panel.setLayout(new MigLayout());
		panel.add(choise);
		panel.add(options,"wrap");
		panel.add(ok,"split2");
		panel.add(back);
		
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(500,500);
		frame.setSize(400,200);
		frame.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ok){
			Operations o = new Operations();
			if(options.getSelectedItem().toString() == "Add Patient"){
				frame.dispose();
				o.AddPatient();
			}
			else if(options.getSelectedItem().toString() == "Delete Patient"){
				frame.dispose();
				o.DeletePatient();
			}
			else if(options.getSelectedItem().toString() == "View Doctor"){
				frame.dispose();
				o.ViewDoc();
			}
			else if(options.getSelectedItem().toString() == "View Patient"){
				frame.dispose();
				o.ViewPatient();
			}
		}
		else{
			frame.dispose();
			new LogInGUI("Manager.txt");
		}
		
	}

}
