// 関数をその場で生み出し、代入し、呼び出す。
import java.util.function.*;

public class Lambda1 {
  public static void main(String args[]){
    //「２つの引数の差を求める処理」の実体を生み出し、代入する。
    IntBinaryOperator func = (int a, int b) -> { return a - b; };
    int a = func.applyAsInt(5, 3);
    System.out.println("5-3は" + a);
  }
}
// (int a, int b) -> { return a - b; };が実行された瞬間、関数の実体が生み出される。
// ラムダ式という構文
//  (型 引数名1, 型 引数名2, ...) -> {
//  処理1;
//  処理2;
//  ...
//  return 戻り値;
//  }
