import java.io.Console;
import java.util.ArrayList;
import java.lang.NumberFormatException;
import java.lang.Integer;

public class PingPong {
  public static void main(String[] args) {
  }

  public Boolean inputIsValid(String myStringNumber) {
      try {
          int myIntNumber =  Integer.parseInt(myStringNumber);
          if (myIntNumber < 0) {
              return false;
          }
      } catch (NumberFormatException e){
          System.out.println("Invalid input. Please enter an integer greater than 0.");
          return false;
      }
      return true;
  }

  public ArrayList<String> playPingPong(String myStringNumber){
      ArrayList<String> result = new ArrayList<String>();
      int myIntNumber = Integer.parseInt(myStringNumber);
      for (int i=1; i<=myIntNumber; i++) {

          if ( i % 15 == 0){
              result.add("Ping-Pong");
          } else if (i % 3 == 0){
              result.add("Ping");
          } else if (i % 5 == 0) {
              result.add("Pong");
          } else {
              result.add(Integer.toString(i));
          }
      }
      return result;
  }
}
