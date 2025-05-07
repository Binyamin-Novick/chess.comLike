package chessengine.advance.multyplayer;

import chessengine.advance.Enginge;
import chessengine.genral.Game;
import chessengine.genral.Piece;

public class MultyPlayerEngine extends Enginge {

    @Override
    public Game StartGame() {
        return null;
    }

    @Override
    public Game SartGame(Game game) {
        return null;
    }
    public MultyPlayerEngine(String Wplayerinfo,String Bplayerinfo){}
    public String engineId(){return null}
    //this will starts game over sequnce
    public void gameOver(Piece.color winer){}

    public void sendeloupdate(){}
    public void sendGametoodatabase(){}


}
