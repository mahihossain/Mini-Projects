import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Doctor {
	private String name;
	private String visitingFee;
	private String email;
	private String phone;
	
	public Doctor(String phone,String name,String email,String visitingFee){
		this.name = name;
		this.visitingFee = visitingFee;
		this.email = email;
		this.phone = phone;
	}
	
	public void addDoctor(){
		File f = new File("Doctor.txt");
		try {
			FileWriter fw = new FileWriter(f,true);
			String s = phone+" "+name+" "+email+" "+visitingFee+"\n";
			fw.write(s);
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void SetName(String name){
		this.name = name;
	}
	public void SetVisitingFee(String visitingFee){
		this.visitingFee = visitingFee;
	}
	public void SetEmail(String email){
		this.email = email;
	}
	public void SetPhone(String phone){
		this.phone = phone;
	}
	public String GetName(){
		return name;
	}
	public String GetPhone(){
		return phone;
	}
	public String GetEmail(){
		return email;
	}
	public String GetVisitingFee(){
		return visitingFee;
	}
	

}
