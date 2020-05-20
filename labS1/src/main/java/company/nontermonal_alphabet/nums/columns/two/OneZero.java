package company.nontermonal_alphabet.nums.columns.two;

import company.nontermonal_alphabet.Type;
import company.nontermonal_alphabet.WhiteColumn;
import company.nontermonal_alphabet.WhiteRow;
import company.nontermonal_alphabet.nums.OneWhite;
import company.nontermonal_alphabet.nums.ZeroWhite;
import org.javatuples.Pair;

public class OneZero extends Type {
    private static OneZero oneZero;

    public static OneZero getInstance(){
        if(oneZero == null)
            oneZero = new OneZero();
        return oneZero;
    }

    private OneZero() {
        this.vRules = new Pair[]{new Pair<>(OneWhite.getInstance(), ZeroWhite.getInstance()), new Pair<>(OneWhite.getInstance(), ZeroWhite.getInstance()),
                new Pair<>(OneWhite.getInstance(), ZeroWhite.getInstance()),
                Pair.with(this, WhiteRow.getInstance()), Pair.with(WhiteRow.getInstance(), this)};
        this.hRules = new Pair[]{Pair.with(this, WhiteColumn.getInstance()), Pair.with(WhiteColumn.getInstance(), this)};
        this.rename = new Type[]{};
    }
}
