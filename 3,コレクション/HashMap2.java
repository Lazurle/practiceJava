import java.util.*;

public class HashMap2 {
  public static void main(String args[]){
    Map<String, Integer> prefs = new HashMap<String, Integer>();
    //Mapは値の重複は許されるが、キーの重複は許されない
    prefs.put("京都府", 255);
    prefs.put("東京都", 1261);
    prefs.put("熊本県", 181);
    int tokyo = prefs.get("東京都");
    System.out.println("東京都の人口は" + tokyo);
    prefs.remove("京都府");
    prefs.put("熊本県", 182);
    int kumamoto = prefs.get("熊本県");
    System.out.println("熊本県の人口は" + kumamoto);

    //Mapの時のIterator処理は少し特殊
    Iterator<Map.Entry<String, Integer>> iterator = prefs.entrySet().iterator();
    //entrySet()でkeyとvalueの値をセットで取得

    while(iterator.hasNext()){
      Map.Entry<String, Integer> map = (Map.Entry<String, Integer>)iterator.next();
      System.out.println(map.getKey() + ":" + map.getValue());
    }

    prefs.clear();
  }
}
