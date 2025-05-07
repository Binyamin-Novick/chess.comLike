package ds.jobtrackersystem.matchmaker;

import ds.jobtrackersystem.job;

public class matchmaker extends job {

    public boolean mainclust;
    /**
     * in the confige it will be ether m ark down as main clust or not
     * this is the json info to know how to set it up
     * when finshed turning on it will notify the the job traker that it is on
     * will make a leader will have will be tould the lider in confige
     * the confi wil caintain and json itence of
     * this will contian an instence of zookeeper to dised whows leader
     * the match maker algertyhim will be incharge of maeking the new game happen as this will contain an instence of it
     *
     * @param configuration
     */

    public matchmaker(String configuration) {
        super(configuration);
    }

    /**
     * will add the mebers to a list of postcha mebers to oarticipat in algorithm
     * will then make a request to login to handle the to log user in
     *
     */
    public void jionmatchalg(String meberid){

    }

    /**
     * will
     * one verfied will add list to mebers to be part of the match making algerthym
     */
    public void verfied(){}

    /**
     * will back up this to the replicants the back up will have the new epoch
     * will send an ack to jobttraker of all the unbacked up requests
     */
    public void backup(){}

    /**
     * if not leader will take a back up request from leader and save it then send an ack back
     *
     */
    public void backupsave(){}

    /**
     * when this nod becmes a leader will okk at its members and putt them all into the matchmakeing algthime
     */
    public void fastadd(){}

    /**
     * if leader abd iff mark as main clust
     * there will be a thread monitor the traffic that it hase and how well it can handle
     * if it thinks in the near futer
     * it will be to must it will send a request to super leader to add other cluster
     *
     * if it is under 40 persent compacity it will tell leader to chut down one other cluster
     */
    public void asksupperleaderforreleif(){}
}
