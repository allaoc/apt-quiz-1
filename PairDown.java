public class PairDown {
     public int[] fold(int[] list) {
         int len = list.length;
		 final int retlen = (len+1)/2;
		 int[] retlist = new int[retlen];
		 for (int c = 0; c < retlen; c++)
		 {
			 if (len % 2 == 1 && c == retlen - 1) {
				 retlist[c] = list[2*c];
			 }
			 else {
				retlist[c] = list[2*c+1]+list[2*c];
			 }
		 }
         return retlist;
     }
 }