package objectserilization;

public class classmain implements java.io.Serializable{
	public String name;
	public String DOB;
	public String Depar;
	public String Des;
	public double salary;
	classmain(){
	}
	public classmain(String name, String dOB, String depar, String des,
			double salary) {
		super();
		this.name = name;
		DOB = dOB;
		Depar = depar;
		Des = des;
		this.salary = salary;
	}
	
	public String toStting(){
		return "name :"+name+" Dob :"+DOB+" Depar:"+Depar+" Des"+Des+" salary:"+salary;
	}
	
}
