
public class RecursiveSearcher {
	
	public int RecursiveSearcher() {

	public int doBinarySearch(IntegerArray arrayOfInts, int target) {
		 return dobinarySearch(target, 0, arrayOfInts.length()-1);
	}
	}
	private int dobinarySearch(Object target, int lo, int hi){
		   if(lo > hi) {
		      return -1;
		   } else {
		      int mid = (lo+hi)/2;
		      int comp = vec[mid].compareTo(target);
		      if(comp == 0){
		          return mid;
		      } else if(comp < 0){
		          return dobinarySearch(target, mid+1, hi);
		      } else {
		          return dobinarySearch(target, lo, mid-1);
		   }
		}
}
	}
