package ds.gatway;

import ds.utils.serverbox;

import java.net.InetSocketAddress;
import java.util.HashMap;

public class gatway extends serverbox {
    /**'
     * will do a zookerper stya election the leader will take request and pass it down to the followers
     * a follwer will look at a request and see what requeadr like iff its a log in it will send for the loginer to do the login thing
     *
     * @param clustermebers the mebers of the cluster
     * @param myid my id
     * @param groupip the sooket that the goup will take http request froms
     */

    public gatway(HashMap<Integer, InetSocketAddress> clustermebers, int myid,InetSocketAddress groupip) {
        super(clustermebers, myid);
    }

    /**
     * will use a apr to lett it have the leader ip adress

     */
    public void becmaesleader(){}

    /**
     * if a follower it will store the request then it will call the apropret function there will be a thread pool for this to maximize threpuut
     */
    public void getrequestfromleader(){}

    public void login(){}
    public void singup(){
    }
    public void getgamedata(){}
    public void makemove(){}
    public void anilizedata(){}
    public void askAi(){}
    public void jiongame(){}

}
