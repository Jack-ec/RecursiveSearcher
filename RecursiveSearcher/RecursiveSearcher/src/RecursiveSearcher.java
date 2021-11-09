
public class RecursiveSearcher {


		int doBinarySearch(IntegerArray arrayOfInts, int target) {
			return doBinarySearch(arrayOfInts, target, 0, arrayOfInts.length()-1);
		}
		
		int doBinarySearch(IntegerArray arrayOfInts1, int target1, int start, int end){
	
			int middle = (start + end)/2;
	
			if(end < start){
				return -1;
			} 
	
	
			if (target1 < arrayOfInts1.read(middle)){
				return doBinarySearch(arrayOfInts1, target1, start, middle - 1);
			}
	
			if (target1 > arrayOfInts1.read(middle)){
				return doBinarySearch(arrayOfInts1, target1, middle + 1, end);
			}
	
			if (target1 == arrayOfInts1.read(middle)) {
				return middle;
			}
	
			return -1;
		}
	}


