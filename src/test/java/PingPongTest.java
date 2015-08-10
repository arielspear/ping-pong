import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PingPongTest {
    @Test
    public void playPingPong_countsToNumber_correctArrayList() {
        PingPong testPingPong = new PingPong();
        ArrayList<String> expected =  new ArrayList<String>();
        expected.add("1");
        expected.add("2");
        assertEquals(expected, testPingPong.playPingPong("2"));
    }


    @Test
    public void playPingPong_pingForMultiplesOfThree_ping() {
        PingPong testPingPong = new PingPong();
        ArrayList<String> expected =  new ArrayList<String>();
        expected.add("1");
        expected.add("2");
        expected.add("Ping");
        assertEquals(expected, testPingPong.playPingPong("3"));
    }

    @Test
    public void playPingPong_pingForMultiplesOfFive_pong() {
        PingPong testPingPong = new PingPong();
        ArrayList<String> expected =  new ArrayList<String>();
        expected.add("1");
        expected.add("2");
        expected.add("Ping");
        expected.add("4");
        expected.add("Pong");
        assertEquals(expected, testPingPong.playPingPong("5"));
    }

    @Test
    public void playPingPong_pingPongForMultiplesOfFifteen_pingPong() {
        PingPong testPingPong = new PingPong();
        ArrayList<String> expected =  new ArrayList<String>();
        expected.add("1");
        expected.add("2");
        expected.add("Ping");
        expected.add("4");
        expected.add("Pong");
        expected.add("Ping");
        expected.add("7");
        expected.add("8");
        expected.add("Ping");
        expected.add("Pong");
        expected.add("11");
        expected.add("Ping");
        expected.add("13");
        expected.add("14");
        expected.add("Ping-Pong");
        assertEquals(expected, testPingPong.playPingPong("15"));
    }

    @Test
    public void inputIsValid_rejectNumbersLessThanOne_false() {
        PingPong testPingPong = new PingPong();
        assertEquals(false, testPingPong.inputIsValid("-2"));
    }

    @Test
    public void inputIsValid_rejectTypesOtherThanInt_false() {
        PingPong testPingPong = new PingPong();
        assertEquals(false, testPingPong.inputIsValid("hello"));
    }

}
