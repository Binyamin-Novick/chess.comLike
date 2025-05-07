package ds.loadbalncers;

import ds.utils.serverLeadLookFollow;
import ds.utils.zookeeperElection;

public class loadblaencerstatuf implements serverLeadLookFollow {
    /**
     * will have difrent stuses depending on what context it is curenlty set for will configure
     * it self in the extra plrosezing slot that zookeper will internaly have
     *
     * */


    public loadblaencerstatuf(loadbalncerbox lbb){

    }
    @Override
    public status getStatuse() {
        return null;
    }

    @Override
    public void stutuschang(zookeeperElection.Vote v) {

    }
}
