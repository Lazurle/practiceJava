import java.util.*;
import java.util.stream.Stream;

public class StreamAPI1 {
  public static void main(String args[]){
    ArrayList<Integer> array = new ArrayList<Integer>();
    array.add(1);
    array.add(2);
    array.add(3);

    for(int i : array){
      System.out.println("ArrayList<Integer> = " + i);
    }
/*
    array.stream().forEach(i -> i * 2);

    System.out.println("StreamAPI実行後");
    for(int i : array){
      System.out.println("ArrayList<Integer> = " + i);
      */
    }
  }
