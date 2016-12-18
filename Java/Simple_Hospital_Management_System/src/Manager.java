import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Manager {
	private String name;
	private String username;
	private String password;
	
	public Manager(String username,String name,String password){
		this.name = name;
		this.username = username;
		this.password = password;
	}
	public void addManager(){
		File f = new File("Manager.txt");
		try {
			FileWriter fw = new FileWriter(f,true);
			String d = username+" "+name+" "+password+"\n";
			fw.write(d);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getName(){
		return name;
	}
	public String getUserName(){
		return username;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setUserName(String username){
		this.username = username;
	}
	public void setPassword(String password){
		this.password = password;
	}

}
