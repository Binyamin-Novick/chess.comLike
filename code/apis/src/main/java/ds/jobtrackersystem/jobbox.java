package ds.jobtrackersystem;

import ds.utils.serverbox;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.List;

public class jobbox extends serverbox {

    /**
     * will as defult only have the hart beet listen for tracker manger clusters
     *  will be listening for one of a few messgeges
     *
     *  start job this will tell the job box wich job to state
     *
     *  end job this will shut down what job it was curently does
     *
     *  work send work to curently runing job
     *  the job will handle the work
     *
     *  jobT mislinas stuf a job might want but is not work the job will handle it
     *
     *  jion replicants join one of the trackers replicants
     *
     * by deflut we will have all misalainus  messges sent to the job to see if it can handle them
     *
     *
     *
     * @param trackersAdreases these are the vip of the trackers
     * @param clustermebers
     * @param myid
     */
    public jobbox(HashMap<Integer, InetSocketAddress> clustermebers, int myid, List<InetSocketAddress> trackersAdreases) {
        super(clustermebers, myid);
    }

    /**
     * will start up the job class that classes are maped from
     * job name if messge is more then one line then that is json that will be passed into the start of the job for configuration pupases
     * this will only hapen at the
     * if a replicant or already have a job feruze to jion and do not send back an ok
     * @param job name of job
     */
    public void startupjob(String job)
    {}

    /**
     * this will end the curnt job at the leaders request
     */
    public void endjob(){

    }

    /**
     * this will becme one of the raft rempicants of the spesifided traker manger info caintains in json all infomation neede to efectly jion as a replicant
     * will refuse if already have a job
     * @param jsoninfo
     */
    public void becomeareplicant(String jsoninfo){}


}
