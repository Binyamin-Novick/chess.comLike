package ds.datagenrale;

import ds.utils.serverbox;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.List;

public class rangbasehashers extends serverbox {
    public class rang{
       public String botom;
      public String top;
      public InetSocketAddress inetSocketAddress;
    }

    /**
     *  will take a look at the messege
     *  range id at the botom
     *  will strip it and forword the messge to one of the ipsocket ta its rang id fallse into
     *
     *  for gamedata rang id should equli gid
     *  for memberdata relted stuff it will be the mebers data
     *
     * @param clustermebers
     * @param myid
     * @param ranges this is tha range of stings and were to send messges with teh rang id
     */
    public rangbasehashers(HashMap<Integer, InetSocketAddress> clustermebers, int myid, List<rang> ranges) {
        super(clustermebers, myid);
    }
}
