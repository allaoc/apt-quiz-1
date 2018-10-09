public class HashTaggery {
      public String maxTag(String[] tags, String[] messages) {
          int total = messages.length;
		  int matches = 0;
		  boolean next = false;
		  for (String message : messages) {
			  String[] words = message.split(" ");
			  for (String word : words) {
				  for (String tag : tags) {
					  if (tag.charAt(0) != '#') {
						  continue;
					  }
					  if (word.equals(tag)) {
						  matches++;
						  next = true;
						  break;
					  }
				  }
			  if (next) {
				  next = false;
				  break;
			  }
			  }
		  }
		  if ((double) matches/total >= 0.75) {
			  return "tagged";
		  }
          return "missed";
      }
  }