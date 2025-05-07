package clientapp;

import chessengine.genral.Game;
import chessengine.genral.Move;

import java.util.List;

public class clintapp {

    public String logging(String user,String password){
        // will attmpt to log in if looged in alreaded will just return null if failed will return faild to log in string
        //if suscseed will stat up a thread that will listen for still active request it will then return it


    }
    //will do nothing but return null if logged in will return failed string if failed to
    //if suscseed will stat up a thread that will listen for still active request it will then return it

    public String signUp(String user ,String password){

    }
   //will only work if in games
    //will request system to analyze your game
    public String anlizegame(Game game){}
    //will only retunr if ur in home will then take you to games
    public List<Game>getGames(){}
    ///go home
    public void  gohome(){}
    //will only work if your in home
    // ask system to jion multyplayergame
    public void joingame(){}
    //will only work if your in home
    public Game startlocalgame(){}
    //will only work if your in multyplayergame or local game
    //will send move to system with engine id if your multyplayer game
    //if localgame it will just trie to do the move
    public void domove(Move move){

    }
    //will only work if you in multi player game
    //will return the state of ur current game
    public Game getgamestuse(){}
    //will shut down all threads and then exit prosses
    public void exit(){}

    /**
     * ping repond to system request if still longed in
     *
     */
    public void ping(){}


}
