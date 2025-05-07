package ds.chessengine.hasher;

import ds.utils.serverbox;

import java.net.InetSocketAddress;
import java.util.HashMap;

public class GamesHashBox extends serverbox {
    /**
     * the pupase of this is to direct messges to the coreact
     * game engin cluster
     * it will have a thread inside creted on intioltion
     * that will be taking messges from the corect cue
     * then put the messges into the function it will call
     *
     *
     *
     *
     * */
    public GamesHashBox(HashMap<Integer, InetSocketAddress> clustermebers, int myid) {
        super(clustermebers, myid);
    }

    /**
     * this function will take a hash to gid add it then it will call send gid hash if it does not laredy have the hash
     *
     * */
    public void Addhash(String gidH){}
    /**
     * take messege  and send them to the coret michien based off of gid
     * if does not have the gid it will call asknaborsfogid
     * if it does not get a responce in a timly mater it will set that gid to be ignored for some time
     * */
    public void forwordMessge(String messege){}

    /**
     * if is sipost to forword a messge to a gid that  but does not have siad gid it will send out a messge requesting the gid
     * */
    public void asknabordsofogid(String gid){}
    /**
     * this will mark that gid to be ignored for some time if i did not get a responce to the asknabors for gid
     * */
    public void markgidtoignore(String gid){}

    /** brotcast the  to the rest of the hash the gid*/
    public void sendgidhash(String gid){}

    /**
     * remove the hash for the gid
     *
     * */
    public void removegid(String gid){}
}
