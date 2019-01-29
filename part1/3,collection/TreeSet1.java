/* LinkedHashSet 値を格納した順序に整列
 * TreeSet 自然順序（辞書順」）付けで政令
 */
import java.util.*;

public class TreeSet1 {
  public static void main(String args[]){
    Set<String> words = new TreeSet<String>();
    words.add("dog");
    words.add("cat");
    words.add("wolf");
    words.add("panda");
    Iterator iterator = words.iterator();
    while(iterator.hasNext()){
      System.out.println( (String)iterator.next() );//辞書順か確認
    }
  }
}
