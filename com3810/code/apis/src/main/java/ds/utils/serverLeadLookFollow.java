package ds.utils;

public interface serverLeadLookFollow {

    /**
     * this classes is used to be able to tell what statuse the server box is can be
     * complicated like for loadbalnce becase it can be a leader serching or folowing depending on what ip context ur loking at
     *
     * */
    enum status{Leading,Looking,Following}
    public status getStatuse();
    /**
     * will give self an optunity to rercofigure based of of the vote it will porses
     * */
    public default void stutuschang(zookeeperElection.Vote v){

    }

}
