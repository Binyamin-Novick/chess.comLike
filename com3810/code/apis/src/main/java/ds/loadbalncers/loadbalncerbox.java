package ds.loadbalncers;

import ds.utils.serverbox;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.List;

public class loadbalncerbox extends serverbox {
    /**
     * @param forwordsIP this is the ip adress that you will be forwording the messges too.
     * @param frontadress these are the adreses that will be know to the what ever is sending the messges
     *
     *
     * the zoo keeper for leader elections for each id
     *
     *
     * */
    public loadbalncerbox(HashMap<Integer, InetSocketAddress> clustermebers, int myid, List<InetSocketAddress> forwordsIP,List<InetSocketAddress> frontadress) {
        super(clustermebers, myid);
    }
    public int epoch(){
        return -1;
    }
    public HashMap<InetSocketAddress,Integer> mainsIP(){}
    public HashMap<InetSocketAddress,InetSocketAddress>bachups(){}
    public List<InetSocketAddress> mymains(){}
    public List<InetSocketAddress>mybackups{}
    public void makeselfmain(InetSocketAddress adrees){

    }
    public void asingebackup(int id){}
    public boolean hasBackupOrMain(InetSocketAddress address){}
    public void launchElectionfor(InetSocketAddress address){}

    public void requestepochs(){}
}
