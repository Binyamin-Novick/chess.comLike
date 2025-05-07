package ds.gamedata;

import ds.utils.serverbox;

import java.net.InetSocketAddress;
import java.util.HashMap;

public class gamedataholder extends serverbox {

    /**mesege director will have 4 mesges out side of stadeered hart beat stuff
     *
     *
     * note when i say pop i mean pull
     *
     * put data from out side
     *
     *
     *
     * put data from feller
     *
     * ack to put form feller
     *
     *
     * read data
     *
     *
     *  drop feller
     *
     * */
    public gamedataholder(HashMap<Integer, InetSocketAddress> clustermebers, int myid) {
        super(clustermebers, myid);
    }
    /**
     * it will have a thread poping the que get data from out side
     * it will then call brocast put data insideto the cluster
     * it will start recording the responce time
     * save as game\gid
     * in a json
     *
     *
     * */
    public void recivedFromoutside(){


    }
     /**
      *
      * will be poping the ak que
      *
      * will check the times it tock to get a responce if it notice a pattern of one
      * table taking mutch longer slowing ecry one down it will
      * send a messge to cluster to drop that michien
      * send ack back from the one that enshaly saw the request sent when all the acks are recived
      *
      *
      * */
    public void acktoput(){}




    /**
     *
     *
     *
     *
     * pop the frendly put queu
     *
     * save data to the gid i fa json text file with the jid as the name
     * send ack to the one who sent the put
    *
    **/
    public void recivefeller(){

    }

    /**
     *
     * pull from read que look to see if file with that gid
     * if doe s not mark to ignore that gid read messges for some time
     *  send bask the responce with the json attached botom line will be call will have a lint with the request id  edgame data
     *
     * */
    public void read(){

    }
     /**if recive a drop messge will log who sent it and then will shut self off*/
    public void drop(){

    }



}
