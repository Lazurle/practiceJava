public class Clone1{
  public static void main(String args[]){
    Coin YEN10 = new Coin(10, 4.5);
    System.out.println(YEN10);
    System.out.println();
    System.out.println("clone()を使用しインスタンスを複製します。");
    Coin YEN10_2 = new Coin();
    YEN10_2 = YEN10.clone();
    System.out.println(YEN10_2);
    System.out.println();
    System.out.println("clone()で複製した中身を書き換えます。");
    YEN10_2.setPrice(100);
    YEN10_2.setWeight(4.8);
    System.out.println(YEN10_2);
    System.out.println();
    System.out.println(YEN10);
  }
}
/*実行結果
$ java -Duser.language=ja -Dfile.encoding=UTF-8 Clone1
10円, 4.5グラム

clone()を使用しインスタンスを複製します。
10円, 4.5グラム

clone()で複製した中身を書き換えます。
100円, 4.8グラム

10円, 4.5グラム
*/
