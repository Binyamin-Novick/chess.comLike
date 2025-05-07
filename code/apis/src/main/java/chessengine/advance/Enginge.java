package chessengine.advance;

import chessengine.genral.Game;
import chessengine.genral.Move;

public abstract class Enginge {

    public  Game getgame(){}
    // will check if move legal return false if not if is will then update game will check if game over if so will start game over sequences
    public boolean tryMove(Move move){}
    public abstract Game StartGame();
    public abstract Game SartGame(Game game);



}
