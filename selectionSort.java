public class selectionSort {

  public static void main(String[] args) {
    int[] A = {-21, 14, 117, -85, 82};
    selectSort(A);
    for (int i = 0; i < A.length; i++) {
         System.out.println(A[i]);
         
  }
}

public static int[] selectSort(int[] array) {
  for (int i = 0; i < 3; i++) {
   int min = array[i];
   int minIndex = i;
     for (int j = i + 1; j < array.length; j++) {
       if (min > array[j]) {
         min = array[j];
         minIndex = j;
         }
      }
     //if (minIndex == i) {
       array[minIndex] = array[i];
       array[i] = min;
    // }
    }
  return array;
}
}
