package src.comparator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class mainComparator {

	public static void main(String[] args) throws IOException{
	
		 StudentComparator s1=new StudentComparator();
		 StudentComparator s2=new StudentComparator();
		 StudentComparator s3=new StudentComparator();
		 StudentComparator s4=new StudentComparator();
		
	        
	    ArrayList<StudentComparator> ar=new ArrayList<StudentComparator>();    
	    ar.add(s1);
	    ar.add(s2);
	    ar.add(s3);
	    ar.add(s4);
	    
//	    ArrayList<String> ar1=new ArrayList<String>();    
//	    ar1.add("rahul");
//	    ar1.add("kapil");
//	    ar1.add("rohit");
//	    ar1.add("ANYONE");
//	    
//	    System.out.println(ar1);
	    
	  NameComparator m=new NameComparator();
	  Collections.sort(ar,m);
	    for(StudentComparator s:ar)
	    System.out.println(s.getRoll_no()+" "+s.getName()+" "+s.getMarks());    
	        
	    }
	
}
