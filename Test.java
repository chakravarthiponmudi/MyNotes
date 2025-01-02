import java.util.List;
import java.util.Map;

class GameOrchestrator {
    //service that managers different games and players and starts and stops the game


    public static void  startGame() {

    }

}

class Dashboard {
    List<PlayerScoreCard> playerScoreCard;
}

class PlayerScoreCard {
    Player p;
    int gamesPlayed;
    int gamesWon;
}

class Game{
    Board board;
    Map<Player,MoveResult> players;

    Game(Board board, List<Player> players){}

    public void startPlay() {
        //initialize board
        while(board.isWon()) {
            int diceNumber = getNextPlayerDice();
            MoveResult result = board.move(getCurrentPlayerPosition(), diceNumber);
            updatePlayer(result);
        }

    }

    private int getNextPlayerDice() {
            return 0;
        
    }

    private int getCurrentPlayerPosition() {
        return 0;
    }

    private void updatePlayer(MoveResult result){

    };

    public Player getWinner(){
        return null;
    };
    

}

class GameBuilder {
    
}

interface Board {
    MoveResult move(int pos, int step);
    boolean isWon();
}

class SnakeBoard1 implements Board {

    @Override
    public MoveResult move(int pos, int step) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    @Override
    public boolean isWon() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isWon'");
    }

}

record MoveResult(int position, int isWon){};

class Account {
    String name;
    
}

class Player extends Account {

}