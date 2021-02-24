public class Hanoi {
   
   public static void MoveDisk (int from, int to) {
      System.out.printf("%d" -> "%d"\n", from, to);
   }
   
   public static void moveStack (int n, int from, int to) {
      if (n != 0) {
         int other = 6 - (from + to);
         moveStack(n-1, from, other);
         moveDisk(from, to);
         moveStack(n-1, other, to);
      }   
   }
   
   
   public static void main(String[] args) {
      moveStack(3,1,3);
   }
}
