import java.util.*;
import java.util.regex.*;

public class Exercise10_25 {
	public static String[] split(String s, String regex) {
	    List<String> result = new ArrayList<>();
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(s);
	    int start = 0;
	    while (matcher.find()) {
	        result.add(s.substring(start, matcher.start()));
	        result.add(matcher.group());
	        start = matcher.end();
	    }
	    result.add(s.substring(start));
	    return result.toArray(new String[result.size()]);
	}
	
	    public static void main(String[] args) {
			String[] result = Exercise10_25.split("ab#12#453", "#");
			for (String s : result) {
				System.out.print(s + ", ");
			}
			
			String[] result2 = Exercise10_25.split("a?b?gf#e", "[?#]");
			for (String s : result2) {
				System.out.print(s + ", ");
			}
	    }
	}

	

