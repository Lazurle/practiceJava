//7.3 外部プログラムの実行
import java.lang.ProcessBuilder;

public class ProcessBuilder {
  public static void main(String args[]) throws Exception {
    System.put.println("計算を開始します");
    //計算処理
    System.out.println("計算終了。結果をメモ帳で表示します。");
    ProcessBuilder pb = new ProcessBuilder(
      "%windir%\system32\notepad.exe",
      "calcreport.txt"
    );
    pb.start();//起動！
  }
}
