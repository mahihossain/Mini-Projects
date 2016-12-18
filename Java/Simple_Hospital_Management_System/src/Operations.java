import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;


public class Operations implements ActionListener {
	private JFrame ManagerDeleteframe;
	private JPanel ManagerDeletepanel;
	private JButton ManagerDelete,ManagerDeleteBack;
	private JTextField ManagerDeleteusername;
	private JLabel ManagerDeleteusernameL;
	private JFrame ManagerCreateframe;
	private JPanel ManagerCreatepanel;
	private JButton ManagerCreate,ManagerCreateBack;
	private JTextField ManagerCreateusername;
	private JTextField ManagerCreatename;
	private JTextField ManagerCreatepass;
	private JLabel ManagerCreateusernameL;
	private JLabel ManagerCreatenameL;
	private JLabel ManagerCreatepassL;
	private JFrame AddDocframe;
	private JPanel AddDocpanel;
	private JLabel AddDocNameL;
	private JLabel AddDocEmailL;
	private JLabel AddDocVisitingFeeL;
	private JLabel AddDocPhoneL;
	private JTextField AddDocName;
	private JTextField AddDocEmail;
	private JTextField AddDocVisitingFee;
	private JTextField AddDocPhone;
	private JButton AddDocAdd;
	private JButton AddDocBack;
	private JFrame DeleteDocframe;
	private JPanel DeleteDocpanel;
	private JLabel DeleteDocPhoneL;
	private JTextField DeleteDocPhone;
	private JButton DeleteDocDelete;
	private JButton DeleteDocBack;
	private JFrame AddPatientframe;
	private JPanel AddPatientpanel;
	private JLabel AddPatientPhoneL;
	private JLabel AddPatientNameL;
	private JLabel AddPatientAdmissionDateL;
	private JLabel AddPatientReleaseDateL;
	private JLabel AddPatientTotalDueL;
	private JLabel AddPatientTotalPaidL;
	private JTextField AddPatientName;
	private JTextField AddPatientAdmissionDate;
	private JTextField AddPatientReleaseDate;
	private JTextField AddPatientTotalDue;
	private JTextField AddPatientTotalPaid;
	private JButton AddPatientAdd;
	private JButton AddPatientBack;
	private JTextField AddPatientPhone;
	private JFrame DeletePatientframe;
	private JPanel DeletePatientpanel;
	private JLabel DeletePatientPhoneL;
	private JTextField DeletePatientPhone;
	private JButton DeletePatientDelete;
	private JButton DeletePatientBack;
	private JFrame ViewDoctorframe;
	private JPanel ViewDoctorpanel;
	private JLabel ViewDoctorPhoneL;
	private JTextField ViewDoctorPhone;
	private JButton ViewDoctorSubmit;
	private JButton ViewDoctorBack;
	private JFrame ViewPatientframe;
	private JPanel ViewPatientpanel;
	private JLabel ViewPatientPhoneL;
	private JTextField ViewPatientPhone;
	private JButton ViewPatientSubmit;
	private JButton ViewPatientBack;
	private JLabel ShowDocName;
	private JLabel ShowDocPhone;
	private JLabel ShowDocEmail;
	private JLabel ShowDocVisitingFee;
	private JFrame ShowDocFrame;
	private JPanel ShowDocPanel;
	private JLabel ShowPatientName;
	private JLabel ShowPatientPhone;
	private JLabel ShowPatientAdmissionDate;
	private JLabel ShowPatientReleaseDate;
	private JLabel ShowPatientStillDue;
	private JFrame ShowPatientFrame;
	private JPanel ShowPatientPanel;
	
	
	public void DeleteManager(){
		ManagerDeletepanel = new JPanel();
		ManagerDeleteframe = new JFrame("Delete Manager");
		ManagerDelete = new JButton("Delete");
		ManagerDelete.addActionListener(this);
		ManagerDeleteBack = new JButton("Back");
		ManagerDeleteBack.addActionListener(this);
		ManagerDeleteusernameL = new JLabel("Manager's Username");
 		ManagerDeleteusername = new JTextField();
		ManagerDeleteusername.setPreferredSize( new Dimension( 200, 24 ) );
		ManagerDeletepanel.setLayout(new MigLayout());
		ManagerDeletepanel.add(ManagerDeleteusernameL,"split2");
		ManagerDeletepanel.add(ManagerDeleteusername,"wrap,growx");
		ManagerDeletepanel.add(ManagerDelete,"split2");
		ManagerDeletepanel.add(ManagerDeleteBack);
		ManagerDeleteframe.add(ManagerDeletepanel);
		ManagerDeleteframe.setVisible(true);
		ManagerDeleteframe.pack();
		ManagerDeleteframe.setLocation(400,400);
		ManagerDeleteframe.setSize(400,200);
		ManagerDeleteframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void CreateManager(){
		ManagerCreatepanel = new JPanel();
		ManagerCreateframe = new JFrame("Add Manager");
		ManagerCreate = new JButton("Create");
		ManagerCreate.addActionListener(this);
		ManagerCreateBack = new JButton("Back");
		ManagerCreateBack.addActionListener(this);
		ManagerCreateusernameL = new JLabel("Manager's Username");
		ManagerCreatenameL = new JLabel("Manager's name");
		ManagerCreatepassL = new JLabel("Manager's password");
 		ManagerCreateusername = new JTextField();
 		ManagerCreatename = new JTextField();
 		ManagerCreatepass = new JTextField();
		ManagerCreateusername.setPreferredSize( new Dimension( 200, 24 ) );
		ManagerCreatename.setPreferredSize( new Dimension( 200, 24 ) );
		ManagerCreatepass.setPreferredSize( new Dimension( 200, 24 ) );
		ManagerCreatepanel.setLayout(new MigLayout());
		ManagerCreatepanel.add(ManagerCreateusernameL,"split2");
		ManagerCreatepanel.add(ManagerCreateusername,"wrap,growx");
		ManagerCreatepanel.add(ManagerCreatenameL,"split2");
		ManagerCreatepanel.add(ManagerCreatename,"wrap,growx");
		ManagerCreatepanel.add(ManagerCreatepassL,"split2");
		ManagerCreatepanel.add(ManagerCreatepass,"wrap,growx");
		ManagerCreatepanel.add(ManagerCreate,"split2");
		ManagerCreatepanel.add(ManagerCreateBack);
		ManagerCreateframe.add(ManagerCreatepanel);
		ManagerCreateframe.setVisible(true);
		ManagerCreateframe.pack();
		ManagerCreateframe.setLocation(400,400);
		ManagerCreateframe.setSize(400,200);
		ManagerCreateframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void AddDoc(){
		AddDocframe = new JFrame("Add Doctor");
		AddDocpanel = new JPanel();
		AddDocNameL = new JLabel("Name");
		AddDocEmailL = new JLabel("Email");
		AddDocVisitingFeeL = new JLabel("Visiting Fee");
		AddDocPhoneL = new JLabel("Phone");
		AddDocPhone = new JTextField();
		AddDocName = new JTextField();
		AddDocEmail = new JTextField();
		AddDocVisitingFee = new JTextField();
		AddDocAdd = new JButton("Add");
		AddDocAdd.addActionListener(this);
		AddDocBack = new JButton("Back");
		AddDocBack.addActionListener(this);
		
		AddDocName.setPreferredSize( new Dimension( 200, 24 ) );
		AddDocEmail.setPreferredSize( new Dimension( 200, 24 ) );
		AddDocVisitingFee.setPreferredSize( new Dimension( 200, 24 ) );
		AddDocPhone.setPreferredSize( new Dimension( 200, 24 ) );
		
		AddDocpanel.setLayout(new MigLayout());
		AddDocpanel.add(AddDocNameL);
		AddDocpanel.add(AddDocName,"wrap");
		AddDocpanel.add(AddDocEmailL);
		AddDocpanel.add(AddDocEmail,"wrap");
		AddDocpanel.add(AddDocVisitingFeeL);
		AddDocpanel.add(AddDocVisitingFee,"wrap");
		AddDocpanel.add(AddDocPhoneL);
		AddDocpanel.add(AddDocPhone,"wrap");
		AddDocpanel.add(AddDocAdd,"split2");
		AddDocpanel.add(AddDocBack);
		
		AddDocframe.add(AddDocpanel);
		AddDocframe.setVisible(true);
		AddDocframe.pack();
		AddDocframe.setLocation(400,400);
		AddDocframe.setSize(400,200);
		AddDocframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void DeleteDoc(){
		DeleteDocframe = new JFrame("Delete Doctor");
		DeleteDocpanel = new JPanel();
		DeleteDocPhoneL = new JLabel("Doctor's Phone");
		DeleteDocPhone = new JTextField();
		DeleteDocDelete = new JButton("Delete");
		DeleteDocDelete.addActionListener(this);
		DeleteDocBack = new JButton("Back");
		DeleteDocBack.addActionListener(this);
		
		DeleteDocPhone.setPreferredSize( new Dimension( 200, 24 ) );
		
		
		DeleteDocpanel.setLayout(new MigLayout());
		DeleteDocpanel.add(DeleteDocPhoneL);
		DeleteDocpanel.add(DeleteDocPhone,"wrap");
		DeleteDocpanel.add(DeleteDocDelete,"split2");
		DeleteDocpanel.add(DeleteDocBack);
		
		DeleteDocframe.add(DeleteDocpanel);
		DeleteDocframe.setVisible(true);
		DeleteDocframe.pack();
		DeleteDocframe.setLocation(400,400);
		DeleteDocframe.setSize(400,200);
		DeleteDocframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void AddPatient(){
		AddPatientframe = new JFrame("Add Patient");
		AddPatientpanel = new JPanel();
		AddPatientNameL = new JLabel("Name");
		AddPatientAdmissionDateL = new JLabel("Admission Date");
		AddPatientReleaseDateL = new JLabel("Release Date");
		AddPatientTotalDueL = new JLabel("Total Due");
		AddPatientTotalPaidL = new JLabel("Total Paid");
		AddPatientPhoneL = new JLabel("Phone");
		AddPatientPhone = new JTextField();
		AddPatientName = new JTextField();
		AddPatientAdmissionDate = new JTextField();
		AddPatientReleaseDate = new JTextField();
		AddPatientTotalDue = new JTextField();
		AddPatientTotalPaid = new JTextField();
		AddPatientAdd = new JButton("Add");
		AddPatientAdd.addActionListener(this);
		AddPatientBack = new JButton("Back");
		AddPatientBack.addActionListener(this);
		
		AddPatientName.setPreferredSize( new Dimension( 200, 24 ) );
		AddPatientAdmissionDate.setPreferredSize( new Dimension( 200, 24 ) );
		AddPatientReleaseDate.setPreferredSize( new Dimension( 200, 24 ) );
		AddPatientTotalDue.setPreferredSize( new Dimension( 200, 24 ) );
		AddPatientTotalPaid.setPreferredSize( new Dimension( 200, 24 ) );
		AddPatientPhone.setPreferredSize( new Dimension( 200, 24 ) );
		
		AddPatientpanel.setLayout(new MigLayout());
		AddPatientpanel.add(AddPatientPhoneL);
		AddPatientpanel.add(AddPatientPhone,"wrap");
		AddPatientpanel.add(AddPatientNameL);
		AddPatientpanel.add(AddPatientName,"wrap");
		AddPatientpanel.add(AddPatientAdmissionDateL);
		AddPatientpanel.add(AddPatientAdmissionDate,"wrap");
		AddPatientpanel.add(AddPatientReleaseDateL);
		AddPatientpanel.add(AddPatientReleaseDate,"wrap");
		AddPatientpanel.add(AddPatientTotalDueL);
		AddPatientpanel.add(AddPatientTotalDue,"wrap");
		AddPatientpanel.add(AddPatientTotalPaidL);
		AddPatientpanel.add(AddPatientTotalPaid,"wrap");
		AddPatientpanel.add(AddPatientAdd,"split2");
		AddPatientpanel.add(AddPatientBack);
		
		AddPatientframe.add(AddPatientpanel);
		AddPatientframe.setVisible(true);
		AddPatientframe.pack();
		AddPatientframe.setLocation(400,400);
		AddPatientframe.setSize(400,300);
		AddPatientframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void DeletePatient(){
		DeletePatientframe = new JFrame("Delete Patient");
		DeletePatientpanel = new JPanel();
		DeletePatientPhoneL = new JLabel("Patient's Phone");
		DeletePatientPhone = new JTextField();
		DeletePatientDelete = new JButton("Delete");
		DeletePatientDelete.addActionListener(this);
		DeletePatientBack = new JButton("Back");
		DeletePatientBack.addActionListener(this);
		
		DeletePatientPhone.setPreferredSize( new Dimension( 200, 24 ) );
		
		
		DeletePatientpanel.setLayout(new MigLayout());
		DeletePatientpanel.add(DeletePatientPhoneL);
		DeletePatientpanel.add(DeletePatientPhone,"wrap");
		DeletePatientpanel.add(DeletePatientDelete,"split2");
		DeletePatientpanel.add(DeletePatientBack);
		
		DeletePatientframe.add(DeletePatientpanel);
		DeletePatientframe.setVisible(true);
		DeletePatientframe.pack();
		DeletePatientframe.setLocation(400,400);
		DeletePatientframe.setSize(400,200);
		DeletePatientframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void ViewDoc(){
		ViewDoctorframe = new JFrame("View Doctor");
		ViewDoctorpanel = new JPanel();
		ViewDoctorPhoneL = new JLabel("Doctor's Phone");
		ViewDoctorPhone = new JTextField();
		ViewDoctorSubmit = new JButton("Submit");
		ViewDoctorSubmit.addActionListener(this);
		ViewDoctorBack = new JButton("Back");
		ViewDoctorBack.addActionListener(this);
		
		ViewDoctorPhone.setPreferredSize( new Dimension( 200, 24 ) );
		
		ViewDoctorpanel.setLayout(new MigLayout());
		ViewDoctorpanel.add(ViewDoctorPhoneL);
		ViewDoctorpanel.add(ViewDoctorPhone,"wrap");
		ViewDoctorpanel.add(ViewDoctorSubmit,"split2");
		ViewDoctorpanel.add(ViewDoctorBack);
		
		ViewDoctorframe.add(ViewDoctorpanel);
		ViewDoctorframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ViewDoctorframe.setSize(300,300);
		ViewDoctorframe.setLocation(400,400);
		ViewDoctorframe.pack();
		ViewDoctorframe.setVisible(true);
	}
	
	public void ViewPatient(){
		ViewPatientframe = new JFrame("View Patient");
		ViewPatientpanel = new JPanel();
		ViewPatientPhoneL = new JLabel("Patient's Phone");
		ViewPatientPhone = new JTextField();
		ViewPatientSubmit = new JButton("Submit");
		ViewPatientSubmit.addActionListener(this);
		ViewPatientBack = new JButton("Back");
		ViewPatientBack.addActionListener(this);
		
		ViewPatientPhone.setPreferredSize( new Dimension( 200, 24 ) );
		ViewPatientpanel.setLayout(new MigLayout());
		ViewPatientpanel.add(ViewPatientPhoneL);
		ViewPatientpanel.add(ViewPatientPhone,"wrap");
		ViewPatientpanel.add(ViewPatientSubmit,"split2");
		ViewPatientpanel.add(ViewPatientBack);
		
		ViewPatientframe.add(ViewPatientpanel);
		ViewPatientframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ViewPatientframe.setSize(300,300);
		ViewPatientframe.setLocation(400,400);
		ViewPatientframe.pack();
		ViewPatientframe.setVisible(true);
	}
	public void showDoctor(Doctor d){
		ShowDocFrame = new JFrame("Doctor " + d.GetName()+"'s Details");
		ShowDocName = new JLabel("Name: "+d.GetName());
		ShowDocPhone = new JLabel("Phone: "+d.GetPhone());
		ShowDocEmail = new JLabel("Email: "+d.GetEmail());
		ShowDocVisitingFee = new JLabel("Visiting Fee: "+d.GetVisitingFee());
		ShowDocPanel = new JPanel();
		
		ShowDocPanel.setLayout(new MigLayout());
		
		ShowDocPanel.add(ShowDocName,"wrap,grow");
		ShowDocPanel.add(ShowDocPhone,"wrap,grow");
		ShowDocPanel.add(ShowDocEmail,"wrap,grow");
		ShowDocPanel.add(ShowDocVisitingFee,"grow");
		
		ShowDocFrame.add(ShowDocPanel);
		ShowDocFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ShowDocFrame.setPreferredSize(new Dimension(300,150));
		ShowDocFrame.setLocation(500,500);
		ShowDocFrame.pack();
		ShowDocFrame.setVisible(true);
	}
	public void showPatient(Patient p){
		ShowPatientFrame = new JFrame("Patient " + p.GetName()+"'s Details");
		ShowPatientName = new JLabel("Name: "+p.GetName());
		ShowPatientPhone = new JLabel("Phone: "+p.GetPhoneNumber());
		ShowPatientAdmissionDate = new JLabel("Patient's Admission Date: "+p.GetDateOfAdmission());
		ShowPatientReleaseDate = new JLabel("Patient's Release Date: "+p.GetRealeaseDate());
		ShowPatientStillDue = new JLabel("Still Due: "+p.GetStillDue());
		ShowPatientPanel = new JPanel();
		
		ShowPatientPanel.setLayout(new MigLayout());
		
		ShowPatientPanel.add(ShowPatientName,"wrap,grow");
		ShowPatientPanel.add(ShowPatientPhone,"wrap,grow");
		ShowPatientPanel.add(ShowPatientAdmissionDate,"wrap,grow");
		ShowPatientPanel.add(ShowPatientReleaseDate,"wrap,grow");
		ShowPatientPanel.add(ShowPatientStillDue,"grow");
		
		ShowPatientFrame.add(ShowPatientPanel);
		ShowPatientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ShowPatientFrame.setPreferredSize(new Dimension(300,200));
		ShowPatientFrame.setLocation(500,500);
		ShowPatientFrame.pack();
		ShowPatientFrame.setVisible(true);
	}


	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ManagerDelete){
			File inputFile = new File("Manager.txt");
			File tempFile = new File("ManagerTempFile.txt");

			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new FileReader(inputFile));
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			BufferedWriter writer = null;
			try {
				writer = new BufferedWriter(new FileWriter(tempFile));
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			String lineToRemove = ManagerDeleteusername.getText();
			String currentLine;

			try {
				while((currentLine = reader.readLine()) != null) {
				    //trim newline when comparing with lineToRemove
				    String trimmedLine = currentLine.trim();
				    if(trimmedLine.startsWith(lineToRemove)) continue;
				    writer.write(currentLine + System.getProperty("line.separator"));
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				writer.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			} 
			try {
				reader.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			} 
			boolean successful = tempFile.renameTo(inputFile);
			if(successful){
				System.out.println("Manager deleted successfully!");
				ManagerDeleteframe.dispose();
				new AdminGUI();
			}
			
		}
		else if(e.getSource() == ManagerDeleteBack ){
			ManagerDeleteframe.dispose();
			new AdminGUI();
		}
		else if(e.getSource() == ManagerCreate){
			String username = ManagerCreateusername.getText();
			String name = ManagerCreatename.getText();
			String pass = ManagerCreatepass.getText();
			Manager m = new Manager(username,name,pass);
			m.addManager();
			System.out.println("Manager added successfully!!!");
			ManagerCreateframe.dispose();
			new AdminGUI();
		}
		else if(e.getSource() == ManagerCreateBack){
			ManagerCreateframe.dispose();
			new AdminGUI();
		}
		else if(e.getSource() == AddDocAdd){
			String name = AddDocName.getText();
			String email = AddDocEmail.getText();
			String visitingFee = AddDocVisitingFee.getText();
			String phone = AddDocPhone.getText();
			
			Doctor d = new Doctor(name,visitingFee,email,phone);
			d.addDoctor();
			System.out.println("Doctor added successfully!!!");
			AddDocframe.dispose();
		}
		else if(e.getSource() == AddDocBack){
			AddDocframe.dispose();
		}
		else if(e.getSource() == DeleteDocDelete){
			File inputFile = new File("Doctor.txt");
			File tempFile = new File("DoctorTempFile.txt");

			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new FileReader(inputFile));
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			BufferedWriter writer = null;
			try {
				writer = new BufferedWriter(new FileWriter(tempFile));
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			String lineToRemove = DeleteDocPhone.getText();
			String currentLine;

			try {
				while((currentLine = reader.readLine()) != null) {
				    //trim newline when comparing with lineToRemove
				    String trimmedLine = currentLine.trim();
				    if(trimmedLine.startsWith(lineToRemove)) continue;
				    writer.write(currentLine + System.getProperty("line.separator"));
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				writer.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			} 
			try {
				reader.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			} 
			boolean successful = tempFile.renameTo(inputFile);
			if(successful){
				System.out.println("Doctor deleted successfully!");
				DeleteDocframe.dispose();
			}
		}
		else if(e.getSource() == DeleteDocBack){
			DeleteDocframe.dispose();
		}
		else if(e.getSource() == AddPatientAdd){
			String name = AddPatientName.getText();
			String admissionDate= AddPatientAdmissionDate.getText();
			double totalDue = Double.parseDouble(AddPatientTotalDue.getText());
			double totalPaid = Double.parseDouble(AddPatientTotalPaid.getText());
			String releaseDate = AddPatientReleaseDate.getText();
			String phone = AddPatientPhone.getText();
			
			Patient p = new Patient(name,admissionDate,releaseDate,phone,totalDue,totalPaid);
			p.AddPatient();
			System.out.println("Patient added successfully!!");
			AddPatientframe.dispose();
		}
		else if(e.getSource() == AddPatientBack){
			AddPatientframe.dispose();
		}
		else if(e.getSource() == DeletePatientDelete){
			File inputFile = new File("Patient.txt");
			File tempFile = new File("PatientTempFile.txt");

			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new FileReader(inputFile));
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			BufferedWriter writer = null;
			try {
				writer = new BufferedWriter(new FileWriter(tempFile));
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			String lineToRemove = DeletePatientPhone.getText();
			String currentLine;

			try {
				while((currentLine = reader.readLine()) != null) {
				    //trim newline when comparing with lineToRemove
				    String trimmedLine = currentLine.trim();
				    if(trimmedLine.startsWith(lineToRemove)) continue;
				    writer.write(currentLine + System.getProperty("line.separator"));
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				writer.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			} 
			try {
				reader.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			} 
			boolean successful = tempFile.renameTo(inputFile);
			if(successful){
				System.out.println("Patient deleted successfully!");
				DeletePatientframe.dispose();
			}
		}
		else if(e.getSource() == DeletePatientBack){
			DeletePatientframe.dispose();
		}
		else if(e.getSource() == ViewDoctorSubmit){

			
			File f = new File("Doctor.txt");
			try {
				Scanner sc = new Scanner(f);
				while(sc.hasNextLine() == true){
					String d = sc.nextLine();
					String [] s = d.split(" ");
					if(s[0].equals(ViewDoctorPhone.getText())){
						Doctor doc = new Doctor(s[0],s[1],s[2],s[3]);
						showDoctor(doc);
					}
				}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource() == ViewDoctorBack){
			ViewDoctorframe.dispose();
			new MainGUI();
		}
		
		else if(e.getSource() == ViewPatientSubmit){

			
			File f = new File("Patient.txt");
			try {
				Scanner sc = new Scanner(f);
				while(sc.hasNextLine() == true){
					String d = sc.nextLine();
					String [] s = d.split(" ");
					if(s[0].equals(ViewPatientPhone.getText())){
						Patient p = new Patient(s[1],s[2],s[3],s[0],Double.parseDouble(s[4]),Double.parseDouble(s[5]));
						showPatient(p);
					}
				}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource() == ViewPatientBack){
			ViewPatientframe.dispose();
			new MainGUI();
		}
		
		
		
	}

}
