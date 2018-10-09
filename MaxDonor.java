import java.util.HashMap;
import java.util.Map;
public class MaxDonor {
     public String generous(String[] orgs, int[] amount) {
		 int max = 0;
		 String retstring = new String("");
		 Map<String,Integer> map = new HashMap<>();
		 for (int c = 0; c < orgs.length; c++) {
			 if (!map.containsKey(orgs[c])) {
				 map.put(orgs[c],0);
			 }
			 map.put(orgs[c],map.get(orgs[c])+amount[c]);
		 }
		 for (String k : map.keySet()) {
			 if (map.get(k) > max) {
				 max = map.get(k);
				 retstring = k + ":$" + max;
			 }
		 }
		 return retstring;
     }
 }