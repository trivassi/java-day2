import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class RockPSGameTest {
  @Test
  public void throwShamBo_receiveAndReturnInput_string() {
    String[] expectedOutput = {"R","R"};
    RoShamBo testObj = new RoShamBo();
    assertEquals(expectedOutput, testObj.throwShamBo("R", "R"));
  }

  @Test
  public void p1GameOutcome_returnsGameStatusOfP1_string() {
    String expectedOutput = "Tie";
    RoShamBo testObj = new RoShamBo();
    testObj.throwShamBo("r", "r");
    assertEquals(expectedOutput, testObj.p1GameOutcome());
  }
}
