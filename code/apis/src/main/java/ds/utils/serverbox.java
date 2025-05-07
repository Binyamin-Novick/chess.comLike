package ds.utils;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public abstract class serverbox {
    public serverbox(HashMap<Integer,InetSocketAddress>clustermebers,int myid){}
    public void sendUDPMessge(String messege, InetSocketAddress to){}
    public void sendtcp(String messege,InetSocketAddress to){}
    public HashMap<Integer,InetSocketAddress>idTOadress(){return null;}
    public HashMap<String, BlockingQueue<String>> getincomingmessges(){return null;}

    public HashMap<String, List<InetSocketAddress>>GetseviceAdresses(){return null;} //for contancting outside the service

    public void addserviveip( HashMap<String,InetSocketAddress>adress){

    }
    public void revoveadress(HashMap<String,InetSocketAddress>adress){}
    public int getid(){return -1;}
}
