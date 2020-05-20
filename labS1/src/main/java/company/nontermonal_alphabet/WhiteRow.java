package company.nontermonal_alphabet;

import company.WhitePixel;
import org.javatuples.Pair;

public class WhiteRow extends Type {
    private static WhiteRow whiteRow;

    public static WhiteRow getInstance(){
        if(whiteRow == null)
            whiteRow = new WhiteRow();
        return whiteRow;
    }

    private WhiteRow() {
        this.hRules = new Pair[]{new Pair<>(WhitePixel.getInstance(),this)};
        this.vRules = new Pair[]{};
        this.rename = new Type[]{WhitePixel.getInstance()};
    }

}
