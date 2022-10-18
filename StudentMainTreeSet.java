package com.edu;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
class EduStudent{
	int sid;
	String sname;
	float sfees;
	public EduStudent(int sid, String sname, float sfees) {
		super(); //Object class constructor is called
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}
	@Override
	public String toString() {
		return "EduStudent [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}
	
	
	
}

class StudentSortsFees implements Comparator<EduStudent>{

	@Override
	public int compare(EduStudent o1, EduStudent o2) {
		if(o1.sfees==o2.sfees) 
		    return 0;
		else if(o1.sfees<o2.sfees)
			return -1;
		else
			return 1;
	}
}
		class StudentSortsid implements Comparator<EduStudent>{

			@Override
			public int compare(EduStudent o1, EduStudent o2) {
						if(o1.sid==o2.sid) 
		    return 0;
		else if(o1.sid<o2.sid)
			return -1;
		else
			return 1;
					
	}
		}
	class StudentSortsName implements Comparator<EduStudent>{

		@Override
		public int compare(EduStudent o1, EduStudent o2) {
			return  o1.sname.compareToIgnoreCase(o2.sname);
		}
	
}

public class StudentMainTreeSet {

	public static void main(String[] args) {
		EduStudent s1=new EduStudent(5,"kamalee",200.5f);
		EduStudent s2=new EduStudent(10,"anu",3005.4f);
		EduStudent s3=new EduStudent(3,"bishu",56783.2f);
		
		StudentSortsid sob= new StudentSortsid();
		System.out.println("Sord based on id:");
		Set<EduStudent> tob=new TreeSet<EduStudent>(sob);
		tob.add(s1);
		tob.add(s2);
		tob.add(s3);
		
		System.out.println(tob);
		
		System.out.println("sorted based on name:");
StudentSortsName son=new StudentSortsName();
		
		Set<EduStudent> tob1=new TreeSet<EduStudent>(son);
		tob1.add(s1);
		tob1.add(s2);
		tob1.add(s3);
		
		System.out.println(tob1);
		
		System.out.println("Sorted based on fees:");
StudentSortsFees sof= new StudentSortsFees();
		
		Set<EduStudent> tob2=new TreeSet<EduStudent>(sof);
		tob2.add(s1);
		tob2.add(s2);
		tob2.add(s3);
		
		System.out.println(tob2);
	
}
}