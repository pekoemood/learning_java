public class Dancer extends Character {
  public void dance() {
    System.out.println(this.name + "はダンスした");
  }

  public void attack() {
    System.out.println(this.name + "は" + "攻撃した2のダメージを与えた");
  }
}