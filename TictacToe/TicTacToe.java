import java.util.*;

class TicTacToe {
  Board board;
  Deque<Player> players;

  TicTacToe() {
    initialiseGame();
  }

  private void initialiseGame() {
    Player player1 = new Player(new PlayingPieceX(), "Player1");
    Player player2 = new Player(new PlayingPieceO(), "Player2");
    board = new Board(3);
    players = new LinkedList<Player>();
    players.add(player1);
    players.add(player2);
  }

  public String startGame() {
    boolean winner = false;
    Scanner scan = new Scanner(System.in);
    PlayingPiece[][] playingPiececs = board.playingPieces;
    while (!winner) {
      boolean isEmptyExists = false;
      // for (int i = 0; i < playingPiececs.length; i++) {
      //   for (int j = 0; playingPiececs[i].length; j++) {
      //     if (playingPiececs == null) {
      //       isEmptyExists = true;
      //     }
      //   }
      // }
      if (!isEmptyExists) {
        continue;
      }

      Player currPlayer = players.removeFirst();
      System.out.println("Please enter x and y cordinates");
      int x = scan.nextInt();
      int y = scan.nextInt();
      if (playingPiececs[x][y] != null) {
        players.addFirst(currPlayer);
        System.out.println("Please enter correct position as its already occupied");
        continue;
      }

      boolean win = checkWinner(x, y, playingPiececs);
      if (win) {
        winner = true;
        return currPlayer.name;
      }
    }
    return "tie";
  }

  private boolean checkWinner(int x, int y, PlayingPiece[][] playingPieces) {
    // // checks horizontally
    // for (int i = 0; i < playingPieces.length; i++) {
    //   if (playingPieces[i][0] == playingPieces[i][1] == playingPieces[i][2]) {
    //     return true;
    //   }
    // }
    // // checks vertially
    // for (int i = 0; i < playingPieces.length; i++) {
    //   if (playingPieces[0][i] == playingPieces[1][i] == playingPieces[2][i]) {
    //     return true;
    //   }
    // }

    // // checks dialgnolly
    // if (playingPieces[0][0] == playingPieces[1][1] == playingPieces[2][2]) {
    //   return true;
    // }

    // // checks diagnolly
    // if (playingPieces[0][2] == playingPieces[1][1] == playingPieces[2][0]) {
    //   return true;
    // }
    return false;
  }
}