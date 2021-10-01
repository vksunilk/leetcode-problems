import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
 public static void main(String... args) {
  int i=10;
  while(i++<=10){
   i++;
  }

  System.out.println(i);
  Integer A = new Integer(1);
//  Main t = new Main(A);
  Sample s = new Main.Sample();
  System.out.println(""+s);
  Map<String, List<String>> dm = new HashMap<>();
  Map<String, List<String>> ods = new HashMap<>();
  dm.entrySet().stream()
          .filter(p-> ods.containsKey(p.getKey()))
          .allMatch(p-> ods.get(p.getKey()).equals(p.getValue()));
 }
 static class Sample{
  Sample(){
  }
  private String sss="";
  @Override
  public String toString() {
   return "sample";
  }
 }
}
