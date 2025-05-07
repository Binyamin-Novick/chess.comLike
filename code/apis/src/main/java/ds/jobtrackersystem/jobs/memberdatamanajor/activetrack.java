package ds.jobtrackersystem.jobs.memberdatamanajor;

import ds.jobtrackersystem.job;
import ds.jobtrackersystem.job;

public class activetrack extends job {
    /**
     * this is the json info to know how to set it up
     *when starting up it will be given the id and ip of the head of the cain
     *
     *
     * it will send a request to the head for a link list of it this link list will include it
     *
     * if this becomes tha tail it will notify the tracker that it has changed has bee completed
     * if this becmaes tha head it will notify the tracker that it is the new head
     *there will be a link list data stucture
     * @param configuration
     */
    public activetrack(String configuration) {
        super(configuration);
    }
    /**
     *
     * will be listing form updates to list from header
     * as well wehn ever it sinces a  link going down it will close the gap
     */

    public void maintian_list(){}

    /**
     * pass the data down
     * if if this is not the tail of the data stucture
     */
    public void passdown(){}


    /**
     *
     * this will be a thread theat will be actif iff thsi is the tail it will
     * take in request for data info of when piole were last loged in and it will give the proper responce
     *
     */
    public void logedretrval(){}


    /**
     * this will be only in efect iff it is the head it will be tring to get updates from clints if there still logged in
     */
    public void maintainlogins(){}



    /**
     * will add the meber to the list of mebers that itw will track
     * only works for head
     * one the mebers have had there first back up confirmed by the next node
     * will send a reply back to track that this work is resolved
     * */
    public void addmember(){

    }




}
