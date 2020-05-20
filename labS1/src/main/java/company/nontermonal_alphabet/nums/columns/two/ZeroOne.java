package company.nontermonal_alphabet.nums.columns.two;

import company.nontermonal_alphabet.Type;
import company.nontermonal_alphabet.WhiteColumn;
import company.nontermonal_alphabet.WhiteRow;
import company.nontermonal_alphabet.nums.OneWhite;
import company.nontermonal_alphabet.nums.ZeroWhite;
import org.javatuples.Pair;

public class ZeroOne extends Type {
    private static ZeroOne zeroOne;

    public static ZeroOne getInstance(){
        if(zeroOne == null)
            zeroOne = new ZeroOne();
        return zeroOne;
    }

    private ZeroOne() {
        this.vRules = new Pair[]{new Pair<>(ZeroWhite.getInstance(), OneWhite.getInstance()), new Pair<>(ZeroWhite.getInstance(), OneWhite.getInstance()),
                new Pair<>(ZeroWhite.getInstance(), OneWhite.getInstance()),
                Pair.with(this, WhiteRow.getInstance()), Pair.with( WhiteRow.getInstance(), this)};
        this.hRules = new Pair[]{ Pair.with(this, WhiteColumn.getInstance()), Pair.with( WhiteColumn.getInstance(), this) };
        this.rename = new Type[]{};
    }
}
