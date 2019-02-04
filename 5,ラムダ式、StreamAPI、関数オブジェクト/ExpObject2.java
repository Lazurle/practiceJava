public class ExpObject2 {
  public static int sub(int a, int b){
    return a - b;
  }
  public static void main(String args[]){
    // 宣言したインタフェースに型に代入
    MyFunction func = ExpObject2::sub;
    int a = func.call(5, 3);
    System.out.println("5-3は" + a);
  }
}

//interfaceの定義
interface MyFunction {
  // 格納したいmethod(sub)と同じように
  //（引数はintが２つ、戻り値はintの抽象(abstract)メソッドを準備
  public abstract int call(int x, int y);
}
/**
 * SAMインタフェース ... 一つしか含まないインタフェースのこと。
 * 　変数に格納された関数の呼び出し
 * 　　関数を格納した変数の名前.SAMインタフェースのメソッド名(引数)
 * 　　例：func.call(5, 3);
 */
