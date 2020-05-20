package company.nontermonal_alphabet.nums.columns.triple;

import company.nontermonal_alphabet.Type;
import company.nontermonal_alphabet.WhiteColumn;
import company.nontermonal_alphabet.WhiteRow;
import company.nontermonal_alphabet.nums.OneWhite;
import company.nontermonal_alphabet.nums.ZeroWhite;
import company.nontermonal_alphabet.nums.columns.two.ZeroOne;
import company.nontermonal_alphabet.nums.columns.two.ZeroZero;
import org.javatuples.Pair;

public class ZeroZeroOne extends Type {
    private static ZeroZeroOne zeroZeroOne;

    public static ZeroZeroOne getInstance(){
        if(zeroZeroOne == null)
            zeroZeroOne = new ZeroZeroOne();
        return zeroZeroOne;
    }

    private ZeroZeroOne() {
        this.vRules = new Pair[]{ new Pair<>( ZeroWhite.getInstance(), ZeroOne.getInstance()), new Pair<>( ZeroZero.getInstance(), OneWhite.getInstance()),
                Pair.with(this, WhiteRow.getInstance()), Pair.with( WhiteRow.getInstance(), this)};
        this.hRules = new Pair[]{Pair.with(this, WhiteColumn.getInstance()), Pair.with( WhiteColumn.getInstance(), this)};
        this.rename = new Type[]{};
    }
}
