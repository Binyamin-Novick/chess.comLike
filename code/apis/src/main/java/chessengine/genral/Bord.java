package chessengine.genral;

import java.util.List;

public class Bord {
    public int time;
    public List<Piece>getPieces(){return null;}
    public List<List<Piece>>getBord(){return null;}
    //a unique key for when the bord is in this or equivlent aka pises are same spot and turn is the same
    public int bordId(){return 0;}
    public Piece.color turn(){return null;}
}
