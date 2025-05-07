package ds.utils;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class hartbeatbox {

    /**
    *
    *
    * this is a stadered gosip based hart beet algorithm
    *
    * @param dethNotice when ever the hartbeat box thinks something is dead it will add that to the the que
    * */
    public hartbeatbox(serverbox sb, BlockingQueue<Integer> dethNotice){}

    public boolean isalive(int id){return true;}
    public HashMap<Integer,Boolean> clusterstatus(List<Integer> ids){
        return null;
    }
    public HashMap<Integer,Boolean>allstatus(){
        return null;
    }
}
