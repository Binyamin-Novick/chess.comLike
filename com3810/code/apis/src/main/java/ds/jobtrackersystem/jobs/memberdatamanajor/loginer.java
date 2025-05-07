package ds.jobtrackersystem.jobs.memberdatamanajor;

import ds.jobtrackersystem.job;

public class loginer extends job {
    /**
     * this is the json info to know how to set it up
     * when finshed turning on it will notify the the job traker that it is on
     *
     * list of membrs request tring to login or sign up
     * as well as a map from id to staus of request
     *
     * 4 messge quest login and sign and member-data and active tracker ackt
     *
     * @param configuration
     */
    public loginer(String configuration) {
        super(configuration);
    }

    /**
     * will put this mebers on to a list of mebers it is workign to login on and will add it to the hashmap of ghe stautes of the request to login
     * will make a request to the mebers data will mark hash map as witing for datat
     *
     * @param membersNameAndPassword this will have the username and the pasword of the meber trying to login
     */
    public void login(String membersNameAndPassword){}

/**
 * will put this members on to a list of members it is workign on to sing upand will add it to the hashmap of the stautes of the request
 * will make a request to the members data will mark hash map as writing for datat=
 *
 * @param membersNameAndPassword this will have the username and the pasword of the member trying to signup*/

    public void signup(String membersNameAndPassword){}

    /**
     * just the method that makes the request
     * @param meber
     */

    public void getmeberdata(String meber){}


    /**
     * will recive the data
     *
     * from the members data
     * if that member exists and in the sign-up presses will respond to the device that made the request  for sing up that it is  no good
     *      if it doea not exstet it will send a wirte resquest to the dtat mebers to creat the new member
     *
     * if its a ogin request and it does not exste or the pasword does not match it will respond to the thing that request to login that it is no good
     *      if it is a good username and pasword it will send a request to add the name to the tracker
     *
     *
     */
    public void recievedata(){

    }

    /**
     *  if the ack is from the
     *  the  data major request it will mark that in the status for
     *  a data recive it will pass it on to the recive data que
     *  if it is for a add to active tracker it will check the member that was added
     *      if the meber is in a login state it will remove the member and respond to clint that the login was suckesefull
     *      if its from a sign up then it will mark that login was added to active trsacker
     *          if both the add to tracker and the responce from write data was complet it will respond to the clint that the singup was complete
     *  if ack to write it will mark in the reques sttus for the meber that the write has been sucsefrull
     *      if the tracker has recived both the act from the tracker and the act from this write it will send back to clint the sing up ack
     *
     *
     * when ack it will be reponding with the mebers actual data as well if it sucseful ack
     */

    public void ackhandler(){

    }

}
