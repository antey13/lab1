package company.nontermonal_alphabet.nums;

import company.nontermonal_alphabet.BlackColumn;
import company.nontermonal_alphabet.Type;
import company.nontermonal_alphabet.WhiteRectangle;
import org.javatuples.Pair;

public class WhiteRecBlackColumn extends Type {
    private static WhiteRecBlackColumn whiteRecBlackColumn;

    public static WhiteRecBlackColumn getInstance(){
        if(whiteRecBlackColumn == null)
            whiteRecBlackColumn = new WhiteRecBlackColumn();
        return whiteRecBlackColumn;
    }

    private WhiteRecBlackColumn() {
        this.hRules = new Pair[]{new Pair<>(WhiteRectangle.getInstance(),BlackColumn.getInstance())};
        this.vRules = new Pair[]{};
        this.rename = new Type[]{};
    }
}
