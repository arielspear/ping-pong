import java.io.Console;
import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {

  }

  public Boolean inputIsValid(int myNumber) {
      return (myNumber > 0); 
  }

  public ArrayList<Object> playPingPong(int myNumber){
      ArrayList<Object> result = new ArrayList<Object>();

      for (int i=1; i<=myNumber; i++) {

          if ( i % 15 == 0){
              result.add("Ping-Pong");
          } else if (i % 3 == 0){
              result.add("Ping");
          } else if (i % 5 == 0) {
              result.add("Pong");
          } else {
              result.add(i);
          }
      }
      return result;
  }
}
