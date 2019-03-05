package src.comparator;
import java.lang.String;
import java.util.Comparator;

public class NameComparator implements Comparator<StudentComparator> {

	@Override
	public int compare(StudentComparator s1, StudentComparator s2) {
		
		return s1.getName().compareTo(s2.getName());
          
          

	}
		
}
