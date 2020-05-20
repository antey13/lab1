package company.nontermonal_alphabet.nums.columns.triple;

import company.nontermonal_alphabet.Type;
import company.nontermonal_alphabet.WhiteColumn;
import company.nontermonal_alphabet.WhiteRow;
import company.nontermonal_alphabet.nums.ZeroWhite;
import company.nontermonal_alphabet.nums.columns.two.OneOne;
import org.javatuples.Pair;

public class OneOneZero extends Type {
    private static OneOneZero oneOneZero;

    public static OneOneZero getInstance() {
        if(oneOneZero == null)
            oneOneZero = new OneOneZero();
        return oneOneZero;
    }

    private OneOneZero() {
        this.vRules = new Pair[]{new Pair<>( OneOne.getInstance(), ZeroWhite.getInstance()),
                Pair.with(this, WhiteRow.getInstance()), Pair.with( WhiteRow.getInstance(), this)};
        this.hRules = new Pair[]{new Pair<>(this, WhiteColumn.getInstance()), Pair.with( WhiteColumn.getInstance(), this)};
        this.rename = new Type[]{};
    }
}
