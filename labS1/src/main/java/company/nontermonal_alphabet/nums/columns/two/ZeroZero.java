package company.nontermonal_alphabet.nums.columns.two;

import company.nontermonal_alphabet.Type;
import company.nontermonal_alphabet.WhiteColumn;
import company.nontermonal_alphabet.WhiteRow;
import company.nontermonal_alphabet.nums.ZeroWhite;
import org.javatuples.Pair;

public class ZeroZero extends Type {
    private static ZeroZero zeroZero;

    public static ZeroZero getInstance(){
        if(zeroZero == null)
            zeroZero = new ZeroZero();
        return zeroZero;
    }

    private ZeroZero() {
        this.vRules = new Pair[]{new Pair<>(ZeroWhite.getInstance(), ZeroWhite.getInstance()),
                Pair.with(this, WhiteRow.getInstance()), Pair.with(WhiteRow.getInstance(), this)};
        this.hRules = new Pair[]{ Pair.with(this, WhiteColumn.getInstance()), Pair.with(WhiteColumn.getInstance(), this)};
        this.rename = new Type[]{};
    }
}
