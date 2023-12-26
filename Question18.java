import java.util.Scanner; 
import java.util.Random;

public class Question18
{ 
   public static void main(String[] args)
   {
      Random rand = new Random();
      int[] a = new int [1000];
      
      for (int i = 0 ; i <= 999 ; i++) {
        a[i]  = rand.nextInt(1, 11);
      }
      int[] frequency = new int[10];
      for (int i : a) {
         if (i == 1) {
            frequency[0]++;          
         } 
         if (i == 2) {
            frequency[1]++;          
         } 
         if (i == 3) {
            frequency[2]++;          
         } 
         if (i == 4) {
            frequency[3]++;          
         } 
         if (i == 5) {
            frequency[4]++;          
         } 
         if (i == 6) {
            frequency[5]++;          
         } 
         if (i == 7) {
            frequency[6]++;          
         } 
         if (i == 8) {
            frequency[7]++;          
         } 
         if (i == 9) {
            frequency[8]++;          
         } 
         if (i == 10) {
            frequency[9]++;          
         } 
      }
      System.out.println("freq of 1 " + frequency[0]);
      System.out.println("freq of 2 " + frequency[1]);
      System.out.println("freq of 3 " + frequency[2]);
      System.out.println("freq of 4 " + frequency[3]);
      System.out.println("freq of 5 " + frequency[4]);
      System.out.println("freq of 6 " + frequency[5]);
      System.out.println("freq of 7 " + frequency[6]);
      System.out.println("freq of 8 " + frequency[7]);
      System.out.println("freq of 9 " + frequency[8]);
      System.out.println("freq of 10 " + frequency[9]);
         
    }
}