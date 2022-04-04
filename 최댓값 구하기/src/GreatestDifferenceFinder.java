
public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        int i = 0;
        for (int j=0;j<intArray.length-1;j++) {
        	for (int l=0;l<intArray.length;l++) {
        		int x = intArray[j]-intArray[l];
        		int y = intArray[l]-intArray[j];
        		if (i<x||i<y){
        			if (x<y){
        				i=y;
        			}
        			else{
        				i=x;
        			}
        		}
        	}
        }
    return i;
    }
}