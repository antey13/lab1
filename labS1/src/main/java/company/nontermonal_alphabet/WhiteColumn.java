package company.nontermonal_alphabet;

import company.WhitePixel;
import org.javatuples.Pair;

public class WhiteColumn extends Type {
    private static WhiteColumn whiteColumn;

    public static WhiteColumn getInstance(){
        if(whiteColumn == null)
            whiteColumn = new WhiteColumn();
        return whiteColumn;
    }

    private WhiteColumn() {
        this.vRules = new Pair[]{new Pair<>(WhitePixel.getInstance(),this)};
        this.hRules = new Pair[]{};
        this.rename = new Type[]{WhitePixel.getInstance()};
    }

}
