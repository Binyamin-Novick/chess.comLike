package ds.utils;

import java.util.HashMap;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class messegeDirecture {

    /**
     * will be piling form the inqus messges
     * based of of the last line of the messege will have a value as a hashmap key
     * this will remove the the last line if it does not have the value of END or would go into the end qu
     * and put it in the que that mapes to that most botom line
     * if it does not caintain the value or it is END it will go into the que that has a kay of end
     *
     * */
    public messegeDirecture(HashMap<String, BlockingDeque<String>> whotoget,
                            BlockingQueue<String>tcpreciver,BlockingQueue<String>udpreciver){}
}
