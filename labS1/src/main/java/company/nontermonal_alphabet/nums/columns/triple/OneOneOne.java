package company.nontermonal_alphabet.nums.columns.triple;

import company.nontermonal_alphabet.Type;
import company.nontermonal_alphabet.WhiteColumn;
import company.nontermonal_alphabet.WhiteRow;
import company.nontermonal_alphabet.nums.OneWhite;
import company.nontermonal_alphabet.nums.columns.two.OneOne;
import org.javatuples.Pair;

public class OneOneOne extends Type {
    private static OneOneOne oneOneOne;

    public static OneOneOne getInstance() {
        if( oneOneOne == null)
            oneOneOne = new OneOneOne();
        return oneOneOne;
    }

    private OneOneOne() {
        this.vRules = new Pair[]{new Pair<>( OneOne.getInstance(), OneWhite.getInstance()), Pair.with(this, WhiteRow.getInstance()), Pair.with( WhiteRow.getInstance(), this)};//, new Pair<>(new OneWhite(), new OneOne()), new Pair<>(new One(), new OneOne()), new Pair<>(new OneOne(), new One())};
        this.hRules = new Pair[]{ Pair.with(this, WhiteColumn.getInstance()), Pair.with(WhiteColumn.getInstance(), this)};
        this.rename = new Type[]{};
    }
}
