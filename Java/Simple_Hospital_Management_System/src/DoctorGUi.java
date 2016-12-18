import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;


public class DoctorGUi implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JComboBox options;
	private JLabel query;
	private JButton ok;

	public DoctorGUi() {
		frame = new JFrame("Welcome Doctor");
		panel = new JPanel();
		String[]option = {"Patient Query","Doctor Query"};
		options = new JComboBox(option);
		query = new JLabel("Place you query");
		ok = new JButton("Ok");
		ok.addActionListener(this);
		
		panel.setLayout(new MigLayout());
		
		panel.add(query);
		panel.add(options,"wrap");
		panel.add(ok);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setLocation(400,400);
		frame.pack();
		frame.setVisible(true);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ok && options.getSelectedItem().toString() == "Patient Query"){
			frame.dispose();
			new PatientGUI();
		}
		else{
			Operations o = new Operations();
			frame.dispose();
			o.ViewDoc();
		}
		
	}

}
