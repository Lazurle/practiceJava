import java.util.function.*;
public class ExpObject1 {
  // 2つのint値を受け取り、その差を求め、結果を返す関数。
  public static int sub(int a, int b){
    return a-b;
  }
  public static void main(String args[]){
    // subメソッドの処理ロジックを、変数funcに代入する。
    IntBinaryOperator func = ExpObject1::sub;//ここで"静的(static)method Subへの参照"を代入
    // 変数funcに格納されている処理ロジックを引数5と3で実行する。
    int a = func.applyAsInt(5, 3);//ここで呼び出している。
    System.out.println("5-3は" + a);
  }
}
/**
 * 変数へのメソッド参照の格納
 *  変数名 = クラス名::そのクラスの静的(static)メソッド名
 *  変数名 = インスタンス変数名::そのインスタンスのメソッド名
 *
 * Java8のAPIリファレンスのjava.util.function.IntBinaryOperatorを調べるとこう記述してある
 * 　public interdace IntBinaryOperator {
 *    public abstract int applyAsInt (int left, int right);
 * }
 *
 */
