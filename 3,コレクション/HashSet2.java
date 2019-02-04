import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashSet2 {
  public static void main(String args[]){
    Set<String> colors = new HashSet<String>();
    colors.add("赤");
    colors.add("青");
    colors.add("黄");
    colors.add("緑");
    Iterator iterator = colors.iterator();
    while(iterator.hasNext()){//取り出される順序はバラバラ
      System.out.println( (String)iterator.next() );
    }
  }
}
