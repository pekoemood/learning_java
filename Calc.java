package calcapp.main;

public class Calc {
  public static void main(String[] args) {
    int a = 10;
    int b = 2;
    int total = calcapp.logics.CalcLogic.plus(a, b);
    int delta = calcapp.logics.CalcLogic.minus(a, b);
    System.out.println("合計は" + total + "差分は" + delta);
  }
}