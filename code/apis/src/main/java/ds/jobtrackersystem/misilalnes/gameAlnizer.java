package ds.jobtrackersystem.misilalnes;

import ds.jobtrackersystem.job;

public class gameAlnizer extends job {
    /**
     * this is the json info to know how to set it up
     * when finshed turning on it will notify the the job traker that it is on
     *
     * will have an instence of bord anilizer that will do tha logic and hash results
     *
     * @param configuration
     */
    public gameAlnizer(String configuration) {
        super(configuration);
    }
}
