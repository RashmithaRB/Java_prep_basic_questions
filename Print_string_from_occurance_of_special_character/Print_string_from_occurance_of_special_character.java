package placement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Print_string_from_occurance_of_special_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Nittec@fe";
		String regex="\\W"; //"[^a-zA-Z0-9]"
		Pattern p=Pattern.compile(regex);
		
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(s.substring(m.start()));
		}

	}

}
