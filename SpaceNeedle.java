// Sabreena Yang
// 10/8/2019
// CSE142
// TA: Jeremy Lipschutz 
// Assignment #2
//
// This program will show

public class SpaceNeedle {

   public static final int SIZE = 4;
   
   public static void main(String[] args) {
      tip();
      topBottom();
      bottomLine();
      bottomTop();
      tip();
      body();
      topBottom();
      bottomLine();
   }
   
   public static void tip() {
      for (int i = 1; i <= SIZE; i++) {
         for (int j = 1; j <= 3 * SIZE; j++) {
            System.out.print(" ");
         }
         for (int j = 1; j <= 2; j++) {
            System.out.print("|"); 
         }
         System.out.println();
      }
   }
   
   public static void body() {
      for (int i = 1; i <= SIZE * SIZE; i++) {
         for (int j = 1; j <= 2 * SIZE + 1; j++) {
            System.out.print(" ");
         }
         for (int j = 1; j <= 2; j++) {
            System.out.print("|");
            for (int k = 1; k <= 1 * SIZE - 2; k++) {
               System.out.print("%");
            }
            System.out.print("|");
         }
         System.out.println();
      }
   }
   
   public static void topBottom() {
      for (int i = 1; i <= SIZE; i++) {
         for (int j = 1; j <= -3 * i + SIZE * 3; j++) {
            System.out.print(" ");
         }
         for (int j = 1; j <=2 ; j++) {
            System.out.print("_");
         }
         System.out.print("/");
         for (int j = 1; j <= 3 * i - 3; j++) {
            System.out.print(":");
         }
         for (int j = 1; j <= 2; j++) {
            System.out.print("|");
         }
         for (int j = 1; j <= 3 * i - 3; j++) {
            System.out.print(":");
         }
         System.out.print("\\");
         for (int j = 1; j <=2 ; j++) {
            System.out.print("_");
         }
         System.out.println();
      }
   }
   
   public static void bottomLine() {
      System.out.print("|");
      for (int i = 1; i <= SIZE * 6; i++) {
         System.out.print("\""); 
      }
      System.out.print("|"); 
      System.out.println();
   }
   
   public static void bottomTop() {
      for (int i = 1; i <= SIZE; i++) {
          for (int j = 1; j <= 2 * i - 2; j++) {
            System.out.print(" ");
         }
         System.out.print("\\_/");
         for (int j = 1; j <= -2 * i + SIZE * 3; j++) {
            System.out.print("\\/"); 
         }
         System.out.print("\\_/");
         System.out.println();
      }
   }
}
      
 