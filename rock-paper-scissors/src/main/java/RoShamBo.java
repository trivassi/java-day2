import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class RoShamBo {
  private String[] playerMoves = {"NA", "NA"};

  public String[] throwShamBo(String p1Move, String p2Move) {
    playerMoves[0] = p1Move;
    playerMoves[1] = p2Move;
    return playerMoves;
  }

  public String p1GameOutcome() {
    String p1Outcome = "Win";
    if (playerMoves[0].equals("r")) {
      System.out.println(playerMoves[1]);
      if(playerMoves[1].equals("p"))
        p1Outcome = "Lose";
      else if (playerMoves[1].equals( "r"))
        p1Outcome = "Tie";
    } else if (playerMoves[0].equals( "p")) {
      if(playerMoves[1].equals( "s"))
        p1Outcome = "Lose";
      else if (playerMoves[1].equals( "p"))
        p1Outcome = "Tie";
    } else if (playerMoves[0].equals( "s")) {
      if(playerMoves[1].equals( "r"))
        p1Outcome = "Lose";
      else if (playerMoves[1].equals( "s"))
        p1Outcome = "Tie";
    }
    return p1Outcome;
  }

}
