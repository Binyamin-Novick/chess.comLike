package ds.jobtrackersystem.misilalnes;

import ds.jobtrackersystem.job;

public class gamedatamanjor extends job {
    /**
     * this is the json info to know how to set it up
     * when finshed turning on it will notify the the job traker that it is on
     *
     * @param configuration
     */
    public gamedatamanjor(String configuration) {
        super(configuration);
    }

    /**
     * for ech gid it will request from the game data holder the gids the send them back as well as an ack
     *
     *
     * @param gidread the gid that its requesting data for there may be mutipul gids in a single request will send back data for all
     */
    public void readfromgud(String gidread){

    }

    /**
     * will first ask the bord to gid for apropret gids based off of the bord
     * then it will ask the game data holder for the apropret games based off of the gids then will send it back
     * @param bords the bords that you want games that have had this bord state
     */
    public void readfombord(String bords){}

    /**
     * will add the game to game holder
     * and wll try to add the maping of the state to the gid for all of its states to the bord to gid data
     * when complet will ack
     * @param game
     */

    public void writegamd(String game){}

}
