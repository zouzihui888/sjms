package sjms.demo7;

import java.util.HashMap;

public class PieceFactory {
    private HashMap PiecePool = new HashMap();
    public APieca GetPiece(String key){
        if (!PiecePool.containsKey(key)){
            APieca p = new OnePiece(key);
            PiecePool.put(key, p);
            return p;
        }
        return (APieca)PiecePool.get(key);
    }
}
