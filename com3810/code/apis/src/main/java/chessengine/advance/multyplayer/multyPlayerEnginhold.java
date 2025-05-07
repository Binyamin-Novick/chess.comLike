package chessengine.advance.multyplayer;

import chessengine.genral.Game;

import java.util.List;

public class multyPlayerEnginhold {
    // will start a new engine asynconisly
    //will send players the engine key so the can acsses there game
    public String startNewEngine(String playerinfo, String playerinfo2){}

    public multyPlayerEnginhold() {}
    //will have a datstroctur cantaining a list of engins use key to find ser ther will be an internal thread checking for
    //messeges from match macker then thread wil call start new then will send to the user apps the key to find the game
    // will have a tread listend for up date messges from user apps and then reply to them

    public void removeEngine(String id){}
    //will remove engine form list of engine any request  for that engine will be ignored
    public List<Game>getGames(){}
    public void startgames(List<Game> games){}
}
