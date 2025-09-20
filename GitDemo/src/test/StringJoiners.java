package test;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoiners {
	
public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("i");
		list.add("am");
		list.add("Ratan");
		list.add("Sagavekar");
		
		StringJoiner sjr= new StringJoiner(",","[","]");
		list.forEach(c->sjr.add(c));
		System.out.println(sjr);
		
	}

}
