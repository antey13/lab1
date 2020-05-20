package company.nontermonal_alphabet;

import company.BlackPixel;
import org.javatuples.Pair;

public class BlackRow extends Type {
    private static BlackRow blackRow;

    public static BlackRow getInstance(){
        if(blackRow == null)
            blackRow = new BlackRow();
        return blackRow;
    }

    private BlackRow() {
        this.hRules = new Pair[]{new Pair<>(BlackPixel.getInstance(),this)};
        this.vRules = new Pair[]{};
        this.rename = new Type[]{BlackPixel.getInstance()};
    }
}
