package company.nontermonal_alphabet.nums;

import company.nontermonal_alphabet.BlackRow;
import company.nontermonal_alphabet.Type;
import company.nontermonal_alphabet.WhiteColumn;
import company.nontermonal_alphabet.WhiteRow;
import org.javatuples.Pair;

public class OneWhite extends Type {
    private static OneWhite oneWhite;

    public static OneWhite getInstance(){
        if(oneWhite == null)
            oneWhite = new OneWhite();
        return oneWhite;
    }

    private OneWhite() {
        this.vRules = new Pair[]{new Pair<>(this, WhiteRow.getInstance()), new Pair<>( WhiteRow.getInstance(), this), new Pair<>(BlackRow.getInstance(), WhiteRecBlackColumn.getInstance())};
        this.hRules = new Pair[]{new Pair<>(WhiteColumn.getInstance(), this), new Pair<>(this, WhiteColumn.getInstance())};
        this.rename = new Type[]{};
    }
}
