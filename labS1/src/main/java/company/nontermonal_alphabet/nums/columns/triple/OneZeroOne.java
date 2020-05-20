package company.nontermonal_alphabet.nums.columns.triple;

import company.nontermonal_alphabet.Type;
import company.nontermonal_alphabet.WhiteColumn;
import company.nontermonal_alphabet.WhiteRow;
import company.nontermonal_alphabet.nums.OneWhite;
import company.nontermonal_alphabet.nums.columns.two.OneZero;
import company.nontermonal_alphabet.nums.columns.two.ZeroOne;
import org.javatuples.Pair;

public class OneZeroOne extends Type {
    private static OneZeroOne oneZeroOne;

    public static OneZeroOne getInstance() {
        if(oneZeroOne == null)
            oneZeroOne = new OneZeroOne();
        return oneZeroOne;
    }

    private OneZeroOne() {
        this.vRules = new Pair[]{new Pair<>( OneZero.getInstance(), OneWhite.getInstance()), new Pair<>(OneWhite.getInstance(), ZeroOne.getInstance()),
                Pair.with(this, WhiteRow.getInstance()), Pair.with( WhiteRow.getInstance(), this)};
        this.hRules = new Pair[]{ Pair.with(this, WhiteColumn.getInstance()), Pair.with(WhiteColumn.getInstance(), this)};
        this.rename = new Type[]{};
    }
}
