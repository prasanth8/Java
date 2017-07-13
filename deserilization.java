package objectserilization;

import prasanth.mainmethod;

import java.util.*;
import java.io.*;

public class deserilization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream in=new FileInputStream("C:/Users/admin/Desktop/demolist.ser");
		ObjectInputStream in1=new ObjectInputStream(in);

ArrayList<classmain> a1=(ArrayList<classmain>)in1.readObject();
System.out.println("Reading Object");
for(classmain e1:a1)
	System.out.println(e1.name+" "+e1.Depar+" "+e1.Des+" "+e1.DOB+" "+e1.salary);
 		
}
}
