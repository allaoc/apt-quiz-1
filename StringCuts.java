import java.util.ArrayList;
import java.util.List;
public class StringCuts {
     public String[] filter(String[] list, int minLength) {
         List<String> ret = new ArrayList<String>();
		 for (String str : list) {
			 if (!ret.contains(str) && str.length() >= minLength) {
				 ret.add(str);
			 }
		 }
		 String[] retarr = ret.toArray(new String[0]);
         return retarr;
     }
 }