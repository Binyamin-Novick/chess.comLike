package ds.chessengine;

import ds.utils.serverbox;

import java.net.InetSocketAddress;
import java.util.HashMap;

public class gamesbox extends serverbox {
    public enum gameclusterpart{GM,BU}

    /**
     * while stause is gm it will run in instence of gm box
     * while back up it will have an instence of gamebackup
     *
     * */

    public gamesbox(HashMap<Integer, InetSocketAddress> clustermebers, int myid) {
        super(clustermebers, myid);
    }
    public void toggleGMstate(){

    }
    public boolean isGM(){return false;}
}
