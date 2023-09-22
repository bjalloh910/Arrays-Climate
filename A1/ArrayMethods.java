import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ArrayMethods {

  public static float wholeSum(float[] floatArray) {
        float sum = 0.0f;

        for (float num : floatArray) {
            sum += num;
        }

        return sum;
    }
  public static float sum(float[] floatArray, int lo, int hi) {
    if (lo < 0 || hi > floatArray.length || lo >= hi) {
        // Invalid range, return 0.0f immediately
        return 0.0f;
    }
    
    float sum = 0.0f;
    
    for (int i = lo; i < hi; i++) {
        sum += floatArray[i];
    }
    
    return sum;
  }
  public static float sum(float[] floatArray){ // this overloaded version of the sum method will just take in the array without a range.
    return sum(floatArray, 0, floatArray.length); // call the general sum method with lo set to 0, and hi set to the array length.
  }
  public static float mean(float[] floatArray, int lo, int hi){ // this method returns the mean from a certain range.
     if(floatArray.length == 0){
        return 0.0f;
    }
    if(lo < 0 || hi > floatArray.length || lo >= hi){
        throw new ArrayIndexOutOfBoundsException();
    }
    float total = 0.0f; // total will collect the sum
    for( int i= lo; i<hi; i++){
        total += floatArray[i]; // in each step step of the loop, take the value at i and add it to the total.
    }
    float mean = total/ (hi -lo);
    return mean;
  }
  public static float mean(float[] floatArray){
    return mean(floatArray, 0, floatArray.length);
  }

  public static float min(float[] floatArray, int lo, int hi){
    if(floatArray.length == 0){
        return Float.NaN;
    }
    if(lo < 0 || hi > floatArray.length || lo >= hi){
        throw new ArrayIndexOutOfBoundsException();
    }
    float minimum = Float.POSITIVE_INFINITY; // set the minimum to a large value so the first element encountered in the array will be considered as the minimum value during the initial comparison within the loop.
    for( int i= lo; i<hi; i++){
        if( floatArray[i] < minimum){        // if the value at i is less than the minimum
           minimum = floatArray[i];          // make it the new minimum
        }
    }
    return minimum;                         // return the minimum after the loop is over
  }
  public static float min(float[] floatArray){
    return min(floatArray, 0, floatArray.length);
  }

  public static float max(float[] floatArray, int lo, int hi){
    if(lo == hi){           // if they're equal that indicates an empty range 
        return Float.NaN;
    }
    if( lo < 0 || hi > floatArray.length || lo >= hi){
        throw new ArrayIndexOutOfBoundsException();
    }
    float maximum = Float.NEGATIVE_INFINITY;        // set the maximum
    for(int i = lo; i<hi; i++){
        if(floatArray[i] > maximum){
            maximum = floatArray[i];
        }
    }
    return maximum;
  }
  public static float max(float[] floatArray){
    return max(floatArray, 0, floatArray.length);
  }

  public static float[] lowest(float[] array, int k){
    if(k <= 0) {
      return new float[0];
    }
    Arrays.sort(array);
    float[] result = new float[k];
    Arrays.fill(result, Float.NaN);
    for( int i=0; i< Math.min(k, array.length); i++){
      result[i] = array[i];
    }
    return result;
  }
  public static float[] highest(float[] array, int k){
    if(k<= 0){
      return new float[0];
    }
    Arrays.sort(array);
    float[] result = new float [k];
    Arrays.fill(result, Float.NaN);
    for (int i = 0; i < Math.min(k, array.length); i++) {
        result[i] = array[array.length - 1 - i];
    }
    return result;
  }
// Missing data 
  public static boolean[] isEqualTo(float[] array, double target) {
    boolean[] result = new boolean[array.length];
    for (int i = 0; i < array.length; i++) {
        result[i] = (array[i] == target);
    }
    return result;
  }
  public static boolean[] logicalNot(boolean[] array) {
    boolean[] result = new boolean[array.length];
    for (int i = 0; i < array.length; i++) {
        result[i] = !array[i];
    }
    return result;
  }
  public static float mean(float[] array, boolean[] indicator) {
    float sum = 0.0f;
    int count = 0;
    for (int i = 0; i < array.length; i++) {
        if (indicator[i]) {
            sum += array[i];
            count++;
        }
    }
    if (count == 0) {
      return Float.NaN; // Handle the case where there are no valid values.
    }
    return sum / count;
  }

  // Method to check if each element in a float array is greater than a specified threshold
    public static boolean[] isGreaterThan(float[] arr, float threshold) {
        boolean[] result = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] > threshold;
        }

        return result;
    }

  // Method to check if dates in a String array fall between a specified start and end date
  public static boolean[] datesBetween(String[] dates, String startDate, String endDate) {
      boolean[] result = new boolean[dates.length];
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        
      try {
          Date start = dateFormat.parse(startDate);
          Date end = dateFormat.parse(endDate);
            
          for (int i = 0; i < dates.length; i++) {
              Date currentDate = dateFormat.parse(dates[i]);
              result[i] = (currentDate.compareTo(start) >= 0) && (currentDate.compareTo(end) <= 0);
          }
      } catch (ParseException e) {
          e.printStackTrace();
          // Handle the exception if date parsing fails
          // You can choose to return all `false` or handle it differently
      }
        
      return result;
    }
  public static boolean[] logicalAnd(boolean[] array1, boolean[] array2) {
    if (array1.length != array2.length) {
        throw new IllegalArgumentException("Arrays must have the same length");
    }
      
    boolean[] result = new boolean[array1.length];
    for (int i = 0; i < array1.length; i++) {
        result[i] = array1[i] && array2[i];
    }
    return result;
  }
  // Method to count the number of true values in a boolean array
  public static int count(boolean[] array) {
      int count = 0;
      for (boolean value : array) {
          if (value) {
              count++;
          }
      }
      return count;
  }
  // Method to find the index of the first true value in a boolean array
  public static int findFirst(boolean[] array) {
  for (int i = 0; i < array.length; i++) {
        if (array[i]) {
            return i;
        }
    }
    return -1; // Return -1 if no true value is found
  }
  // Method to find the indices of all true values in a boolean array
  public static int[] find(boolean[] array) {
    int count = count(array);
    int[] indices = new int[count];
    int currentIndex = 0;

    for (int i = 0; i < array.length; i++) {
        if (array[i]) {
            indices[currentIndex++] = i;
        }
    }

    return indices;
  }
}
