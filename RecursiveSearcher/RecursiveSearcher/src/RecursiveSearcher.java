
public class RecursiveSearcher {


		int doBinarySearch(IntegerArray arrayToSearch, int target) {
			return doBinarySearch(arrayToSearch, target, 0, arrayToSearch.length()-1);
		}
		
		private int doBinarySearch(IntegerArray arrayToSearch, int target, int start, int end){
	
	
			if(start > end){
				return -1;
			} 
			int middle = start + (end - start)/2;
			int value = arrayToSearch.read(middle);
	
	
			if (target == value) {
				int temp = middle;
				
				while(--middle >= 0 && arrayToSearch.read(middle) == target) {
					temp = middle;
				}
				return temp;
			} 
			else if (target < value){
				return doBinarySearch(arrayToSearch, target, start, middle - 1);
			}
	
			else {
				return doBinarySearch(arrayToSearch, target, middle + 1, end);
			}
	}
}


