package ds.jobtrackersystem;

public abstract class job {

    /**
     * this is the json info to know how to set it up
     * when finshed turning on it will notify the the job traker that it is on
     * @param configuration
     */
    public job(String configuration){}
    /**
     *
     * this will be the function to notify
     *
     * */
    public void notifyTracker(){}
}
