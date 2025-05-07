package ds.chessengine;

import chessengine.genral.Game;
import chessengine.genral.Move;

import java.util.HashMap;
import java.util.List;

public class GMbox {

    /**
     * on inshaliztion it will set messge directore where it will send the game messges to prosses game measeges
     *
     * */
    public GMbox(gamesbox gamesbox){}
    public void sendbackupgames(){}
    public void makeEnginesFromData(List<Game>games){}
    public void sendusersGameid(Game game){

    }

    /**
     * will lock at game messge and disde what function it needs to call
     * say should it put the messge into move or give it to newgame
     *
     * */

    public void pressesgamemessges(String gmess){}
    public HashMap<String, Move>makemovefrommessege(String gmess){
        return null;//note string is game id move is the move for that gid
    }

    /**
     * handles new game messges by makeing a new game will send new gid to hashers
     * */
    public void prossesnewgamemessge(String ngmessges){}

    /**
     * eather
     * send updat to hasher theat ti eather made new or finshed a game make a  game
     * */
    public void updategamehashers(String gid,boolean shouldbethere){}

}
