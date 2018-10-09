import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Collections;
public class SetAside {
      public String common(String[] list) {
		  List<String> temp = Arrays.asList(list[0].split(" "));
		  HashSet<String> overlaps = new HashSet<String>(temp);
		  for (String words : list) {
			  boolean trash = overlaps.retainAll(Arrays.asList(words.split(" ")));
		  }
		  List<String> inall = new ArrayList<String>(overlaps);
		  Collections.sort(inall);
		  String ret = new String("");
		  if (inall.size() == 0) {
			  return "";
		  }
		  for (int c = 0; c < inall.size()-1 ; c++) {
			  ret = ret + inall.get(c) + " ";
		  }
		  ret = ret + inall.get(inall.size()-1);
          return ret;
      }
  }