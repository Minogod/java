public class AverageFinder {
    double computeAverage(int[] intArray) {
        int sum = 0;
        for (int i=0;i< intArray.length; i++) {
        	sum += intArray[i];
        }
        double x = (double)sum / intArray.length;
        return x;
    }
}