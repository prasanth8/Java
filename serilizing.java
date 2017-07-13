package objectserilization;

import java.io.*;
import java.util.*;

public class serilizing {
	public static void main(String[] args) {
		ArrayList<classmain> al=new ArrayList<>();
		//classmain e[]={new classmain("sakthi","8/7/2017","Delvelopment","salem",2345435),new classmain("prasanth","8/7/2017","Businesxs","salem",234434423)};
al.add(new classmain("prasanth","8/7/1997","HR","Isrel",999999999));
al.add(new classmain("sakthivndhg","24/3/1997","Development","Isrel",342343234));
al.add(new classmain("prasanth","5/2/1997","Business","Isrel",888888888));
		try{
			FileOutputStream out=new FileOutputStream("C:/Users/admin/Desktop/demolist.ser");
		ObjectOutputStream out1=new ObjectOutputStream(out);
		out1.writeObject(al);
		System.out.println("Writing Object.....!");
		
		}catch(Exception e1){
			System.out.println("File not found");
		}
	}}

