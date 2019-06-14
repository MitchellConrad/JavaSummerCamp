//public class Grades {
  import java.util.Arrays;
    
    public static String[] myGrades(double[] array){
      double sum = 0;
      double highestGrade = 0;
      String[] returningArray = new String [4];
       
      
      for (int i = 0; i < array.length; i++) {
        sum = array[i] + sum;
      }
      int average = (int) sum / array.length;
      returningArray[3] = ("The average grade of the class is: " + average);
      
      for (int c = 0; c < array.length; c++) {
      if (array[c] > highestGrade) {
        highestGrade = array[c];
        }
      }
      
      returningArray[0] =("The highest grade in the class is: " + highestGrade);
      
      double lowestGrade = 100;
      for (int d = 0; d < array.length; d++) {
      if (array[d] <= lowestGrade) {
      lowestGrade = array[d];
        }
      }
      returningArray[1] = ("The lowest grade in the class is: " + lowestGrade);
      
      Arrays.sort(array);
      double median = array.length / 2;
      String med = String.format ("%.1f", median);
      if (array.length % 2 == 1) {
        int median1 = (int) (array.length / 2 - 0.5);
        int median2 = (int) (array.length / 2 + 0.5);
        double median3 = (array[median1] + array[median2]) / 2;
        returningArray[2] =("The median score of the class is : " + median3);
      }
      else {
        int media = (int) median;
        median = array[media];
        returningArray[2] = ("The median score of the class is : " + median);
      }
      return returningArray;
  }
  
  public static void main(String[] args) {
        double [] array = {88.5, 100, 67, 72.5, 80, 81.5, 85, 99, 95, 100, 50, 45, 85, 89.5, 92};
        println(myGrades(array));
  }
 //}
 

 
 
