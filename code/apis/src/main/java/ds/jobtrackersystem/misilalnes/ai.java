package ds.jobtrackersystem.misilalnes;

import ds.jobtrackersystem.job;

public class ai extends job {
    /**
     * this is the json info to know how to set it up
     * when finshed turning on it will notify the the job traker that it is on
     *
     * @param configuration
     */
    public ai(String configuration) {
        super(configuration);
    }

    /**
     * will take a look at the bord stat and respond a move
     * @param bord
     */
    public void move(String bord){}
}
