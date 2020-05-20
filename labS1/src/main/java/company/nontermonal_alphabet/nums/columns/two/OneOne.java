package company.nontermonal_alphabet.nums.columns.two;

import company.nontermonal_alphabet.Type;
import company.nontermonal_alphabet.WhiteColumn;
import company.nontermonal_alphabet.WhiteRow;
import company.nontermonal_alphabet.nums.OneWhite;
import org.javatuples.Pair;

public class OneOne extends Type {
    private static OneOne oneOne;

    public static OneOne getInstance(){
        if(oneOne == null)
            oneOne = new OneOne();

        return oneOne;
    }

    private OneOne() {
        this.vRules = new Pair[]{new Pair<>( OneWhite.getInstance(), OneWhite.getInstance()), Pair.with(this, WhiteRow.getInstance()),
                Pair.with( WhiteRow.getInstance(), this)};
        this.hRules = new Pair[]{ Pair.with(this, WhiteColumn.getInstance()), Pair.with( WhiteColumn.getInstance(), this)};
        this.rename = new Type[]{};
    }
}
