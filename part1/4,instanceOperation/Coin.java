//clone()による複製をサポートさせるために
//java.lang.Cloneableインタフェースを実装する。
//Cloneableはclone()を持っているわけではない、マーカーインタフェース
public class Coin implements Cloneable {
  private int price;
  private double weight;

  //コンストラクタ
  Coin(int price, double weight){
    this.price = price;
    this.weight = weight;
  }
  Coin(){
  }

  @Override
  //Objectクラスでprotectedで宣言されてるclone()をpublicでオーバーライドする
  public Coin clone(){
    Coin result = new Coin();
    result.setPrice(this.price);
    result.setWeight(this.weight);
    return result;
  }

  @Override
  //toStringのオーバーライド
  public String toString(){
    return this.price + "円, " + this.weight + "グラム";
  }

  //Getter
  public double getWeight(){
    return this.weight;
  }
  public Integer getPrice(){
    return this.price;
  }

  //Setter
  public void setWeight(double weight){
    this.weight = weight;
  }
  public void setPrice(int price){
    this.price = price;
  }

}
