import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console consoleObj = System.console();
    String user1, user2;
    System.out.println("Player 1, enter your move (r,p,s): ");
    user1 = consoleObj.readLine();
    System.out.println("Player 2, enter your move (r,p,s): ");
    user2 = consoleObj.readLine();
    RoShamBo gameObj = new RoShamBo();
    gameObj.throwShamBo(user1,user2);
    System.out.println("Player 1 gets the " + gameObj.p1GameOutcome() + "!");
  }
}
