package company.nontermonal_alphabet;

import company.BlackPixel;
import org.javatuples.Pair;

public class BlackColumn extends Type {
    private static BlackColumn blackColumn;

    public static BlackColumn getInstance() {
        if(blackColumn == null)
            blackColumn = new BlackColumn();
        return blackColumn;
    }

    private BlackColumn() {
        this.vRules = new Pair[]{new Pair<>(BlackPixel.getInstance(), this)};
        this.hRules = new Pair[]{};
        this.rename = new Type[]{BlackPixel.getInstance()};
    }
}
