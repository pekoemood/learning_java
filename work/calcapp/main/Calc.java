package work.calcapp.main;
import work.calcapp.logics.CalcLogic;
import sub.Sub;

public class Calc {
  public static void main(String[] args) {
    int[] arr = {0,1,2,3,4,5,6,7};
    int[] keys = {3, 6, 4};
    int current = 0;
    int total = 0;

    for(int k : keys) {
      int left = ((k - current)+8) % 8;
      int right = ((current - k) + 8) % 8;
      System.out.println(left);
      System.out.println(right);
      total += Math.min(left, right);
      current = k;
    }

    System.out.println(total);
  }
}