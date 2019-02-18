//7.2 JVMの終了
import java.io.*;

public class Main {
  public static void main(String args[]){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String word = "";
    System.out.println("apple を入力してください");
    try {
    word = reader.readLine();
  } catch(IOException e){
    e.printStackTrace();
  }
    if(word.equals("apple")){
      System.out.println("apple です正常終了します。");
      System.exit(0);
    } else {
      System.out.println("apple じゃありません、異常終了します。");
      System.exit(1);//異常終了
    }
  }
}
