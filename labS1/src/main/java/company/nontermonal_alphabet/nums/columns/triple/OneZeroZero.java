package company.nontermonal_alphabet.nums.columns.triple;

import company.nontermonal_alphabet.Type;
import company.nontermonal_alphabet.WhiteColumn;
import company.nontermonal_alphabet.WhiteRow;
import company.nontermonal_alphabet.nums.OneWhite;
import company.nontermonal_alphabet.nums.ZeroWhite;
import company.nontermonal_alphabet.nums.columns.two.OneZero;
import company.nontermonal_alphabet.nums.columns.two.ZeroZero;
import org.javatuples.Pair;

public class OneZeroZero extends Type {
    private static OneZeroZero oneZeroZero;

    public static OneZeroZero getInstance(){
        if(oneZeroZero == null)
            oneZeroZero = new OneZeroZero();
        return oneZeroZero;
    }

    private OneZeroZero() {
        this.vRules = new Pair[]{new Pair<>( OneZero.getInstance(), ZeroWhite.getInstance()), new Pair<>( OneWhite.getInstance(), ZeroZero.getInstance()),
                Pair.with(this, WhiteRow.getInstance()), Pair.with( WhiteRow.getInstance(), this)};
        this.hRules = new Pair[]{ Pair.with(this, WhiteColumn.getInstance()), Pair.with( WhiteColumn.getInstance(), this)};
        this.rename = new Type[]{};
    }
}
