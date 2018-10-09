import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;
public class DonorStats {
      public String[] calculate(String[] donations) {
          Map<String,Integer> map = new HashMap<String,Integer>();
		  Map<String,Integer> num = new HashMap<String,Integer>();
		  for (String data : donations) {
			  String[] splitted = data.split(":");
			  String candidate = splitted[0];
			  String[] values = splitted[1].split(",");
			  int[] numvals = new int[values.length];
			  int index = 0;
			  int sum = 0;
			  for (String value : values) {
				  sum += Integer.parseInt(value);
				  index++;
			  }
		  if (!map.containsKey(candidate)) {
			  map.put(candidate,0);
			  num.put(candidate,0);
		  }
		  map.put(candidate,map.get(candidate)+sum);
		  num.put(candidate,num.get(candidate)+index);
		  }
		  Set<String> candidates = map.keySet();
		  List<String> sorted = new ArrayList<String>(candidates);
		  Collections.sort(sorted);
		  int index = 0;
		  String[] ret = new String[sorted.size()];
		  for (String name : sorted) {
			  ret[index] = String.format("%s:%d:%d",name,num.get(name),map.get(name));
			  index++;
		  }
          return ret;
      }
  }