import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Patient {
	private String name;
	private String dateOfAdmission;
	private String releaseDate;
	private String PhoneNumber;
	private double TotalDue;
	private double TotalPaid;
	private double StillDue;
	
	public Patient(String name, String dateOfAdmission,String releaseDate,String PhoneNumber,double TotalDue,double TotalPaid){
		this.name = name;
		this.dateOfAdmission = dateOfAdmission;
		this.PhoneNumber = PhoneNumber;
		this.TotalDue = TotalDue;
		this.TotalPaid = TotalPaid;
		this.StillDue = this.TotalDue-this.TotalPaid;
		this.releaseDate = releaseDate;
	}
	
	public void AddPatient(){
		File f = new File("Patient.txt");
		try {
			FileWriter fw = new FileWriter(f);
			String d = PhoneNumber+" "+name+" "+dateOfAdmission+" "+releaseDate+" "+TotalDue+" "+TotalPaid+" "+StillDue+" "+"\n";
			fw.write(d);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void SetName(String name){
		this.name = name;
	}
	public void SetDateOfAdmission(String dateOfAdmission){
		this.dateOfAdmission = dateOfAdmission;
	}
	public void SetPhoneNumber(String PhoneNumber){
		this.PhoneNumber = PhoneNumber;
	}
	public void SetTotalDue(double due){
		TotalDue = due;
	}
	public void SetTotalPaid(double paid){
		TotalPaid = paid;
	}
	public void SetReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}
	public void SetStillDue(){
		StillDue = TotalDue - TotalPaid;
	}
	
	public String GetName(){
		return name;
	}
	public String GetDateOfAdmission(){
		return dateOfAdmission;
	}
	public String GetPhoneNumber(){
		return PhoneNumber;
	}
	public double GetTotalDue(){
		return TotalDue;
	}
	public double GetTotalPaid(){
		return TotalPaid;
	}
	public double GetStillDue(){
		return StillDue;
	}
	public String GetRealeaseDate(){
		return releaseDate;
	}

}
