package intereface_practice;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class fileio {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		
		
		//regex matching
		
		
//		String s="8088480052";
//		Pattern p=Pattern.compile("0+");
//		Matcher m=p.matcher(s);
//		while(m.find()) {
//			System.out.println("0 found");
//			System.out.println(m.group()+" ----"+m.start()+"---"+m.end());
//		}
		
		Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
		FileReader fr=new FileReader("D:\\eclipse\\exercises\\abc.txt");
		BufferedReader bf=new BufferedReader(fr);
		String line=bf.readLine();
		int cnt=0;
		

		while(line!=null) {
		//System.out.println("line:"+line);
			Matcher m=p.matcher(line);
			while(m.find()) {
				System.out.println(m.group());
				cnt++;
			}
			line=bf.readLine();
		}
		bf.close();
		System.out.println("count:"+cnt);
	
	
		
		
		

	}

}