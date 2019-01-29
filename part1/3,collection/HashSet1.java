import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
  public static void main(String args[]){
    Set<String> colors = new HashSet<String>();//HashSetは重複を許さない
    colors.add("赤");
    colors.add("青");
    colors.add("黄");
    System.out.println("色の種類は" + colors.size());
  }
}
