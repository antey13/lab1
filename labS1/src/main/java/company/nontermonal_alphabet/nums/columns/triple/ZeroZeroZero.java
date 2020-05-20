package company.nontermonal_alphabet.nums.columns.triple;

import company.nontermonal_alphabet.Type;
import company.nontermonal_alphabet.WhiteColumn;
import company.nontermonal_alphabet.WhiteRow;
import company.nontermonal_alphabet.nums.ZeroWhite;
import company.nontermonal_alphabet.nums.columns.two.ZeroZero;
import org.javatuples.Pair;

public class ZeroZeroZero extends Type {
    private static ZeroZeroZero zeroZeroZero;

    public static ZeroZeroZero getInstance() {
        if(zeroZeroZero == null)
            zeroZeroZero = new ZeroZeroZero();

        return zeroZeroZero;
    }

    private ZeroZeroZero() {
        this.vRules = new Pair[]{new Pair<>( ZeroZero.getInstance(), ZeroWhite.getInstance()), new Pair<>( ZeroWhite.getInstance(), ZeroZero.getInstance()),
                 new Pair<>( ZeroZero.getInstance(), ZeroWhite.getInstance()),
                Pair.with(this, WhiteRow.getInstance()), Pair.with( WhiteRow.getInstance(), this)};
        this.hRules = new Pair[]{Pair.with(this, WhiteColumn.getInstance()), Pair.with( WhiteColumn.getInstance(), this)};
        this.rename = new Type[]{};
    }
}
