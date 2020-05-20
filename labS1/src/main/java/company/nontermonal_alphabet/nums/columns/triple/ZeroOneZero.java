package company.nontermonal_alphabet.nums.columns.triple;

import company.nontermonal_alphabet.Type;
import company.nontermonal_alphabet.WhiteColumn;
import company.nontermonal_alphabet.WhiteRow;
import company.nontermonal_alphabet.nums.ZeroWhite;
import company.nontermonal_alphabet.nums.columns.two.OneZero;
import company.nontermonal_alphabet.nums.columns.two.ZeroOne;
import org.javatuples.Pair;

public class ZeroOneZero extends Type {
    private static ZeroOneZero zeroOneZero;

    public static ZeroOneZero getInstance() {
        if(zeroOneZero == null)
            zeroOneZero = new ZeroOneZero();

        return zeroOneZero;
    }

    private ZeroOneZero() {
        this.vRules = new Pair[]{ new Pair<>( ZeroWhite.getInstance(), OneZero.getInstance()), new Pair<>( ZeroOne.getInstance(), ZeroWhite.getInstance()),
                Pair.with(this, WhiteRow.getInstance()), Pair.with(WhiteRow.getInstance(), this)};
        this.hRules = new Pair[]{ Pair.with(this, WhiteColumn.getInstance()), Pair.with( WhiteColumn.getInstance(), this)};
        this.rename = new Type[]{};
    }
}
