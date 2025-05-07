package ds.jobtrackersystem.jobs.memberdatamanajor.raft;

import ds.jobtrackersystem.job;
import ds.jobtrackersystem.jobbox;

public class jobtracker  {


    /**
     * there will be 5 tracker cluster each with 5 servers
     * the leader of each will alocate work to jobs
     * the leaders of the 5 will form a over laping cluster were it will hand the jobs the leader of this will be the super leader
     * leaders will have a dedicatred ip adress for taking in request from out side
     * will have an istence of raft box to keep constencey there will be one or two raft boxes
     * if this is a leader then it will have two one fror the hadling of the new job request aka request to make or delite jobs from the stat
     *      michin if its the leader of that dat then it will be called a super leader
     * there will be a raft box always fro kepping track of what work is to waht job
     * the work raft box if it sences that a job is down it will remove the work to that job and send it to a new job it will also send a request to the super leader to remove that job
     * this is the json info to know how to set it up
     * when finshed turning on it will notify the the job traker that it is on
     *
     * @param configuration
     */
    public jobtracker(String configuration, jobbox jb) {

    }

    /**
     *if leader
     *
     * when ever it gets from the out side it will send the work to an active job, log this with the raft box for work and make sure that the  other boxes in the jobs traker culster
     *  will of corse make the replicats are updated
     */

    public void handlenesworkrequest(){}


    /**
     * if leader
     *
     * will take a ack from a job is there mare data to the act will tack it send it back to the client that requested the job
     * logg this with the work raft box
     *
     */
    public void handlerepocese(){}

    /**
     * will be checking for a job thatis down
     * will realocat the work to onther job will make a request from super leader to remove the job
     * will log this action with work box
     */
    public void maintainwork(){}

    /**
     * if leader
     * if a replicant is down it will ask the super leader to give it a job box to replace that replicant
     */
    public void replicatdown(){}

    /**
     * if supper leader
     * opon request will spin uo new jobs in job boxes or will remove them
     * it as well can tell a job box to be a new replicant
     * all these action will be loged in the boxraft for jobs
     *
     * will make sure all leaders are uto dtae on the curent jobs in what job boxes have jobs will
     */
    public void addjobs(){

    }

}
