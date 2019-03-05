package has;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsC {
	public static void main(String[] args) {
		Map<String,String> m=new HashMap<String,String>();
		m.put("fname","Sunny");
		m.put("lname", "Angural");
//		for(String key:m.keySet()) {
//			System.out.println(m.keySet());
//		}
		Set<String> keys=m.keySet();
		for(String key:keys) {
			System.out.println(key+"  "+m.get(key));
		}

	}
}