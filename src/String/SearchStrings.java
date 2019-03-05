package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchStrings {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the strings ::");
		String s=br.readLine();
		System.out.println("Enter the word u want to search ::");
		String s1=br.readLine();
		String s2="";
		int count=0,no=0;
		int j=1;
		boolean flag=false;

		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ' || s.charAt(i)=='.') {
				s2=s.substring(no,i);
				no=count+j;
				if(s1.equals(s2)) {
					flag=true;
					break;
				}
				else
					flag=false;
				j++;
			}
			else 
				count++;

		}
		if(flag==true) 
			System.out.println("True");
		else
			System.out.println("false");
		//System.out.println(s.contains(s1));
	}


}