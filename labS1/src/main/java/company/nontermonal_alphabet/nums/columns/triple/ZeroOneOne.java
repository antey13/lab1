package company.nontermonal_alphabet.nums.columns.triple;

import company.nontermonal_alphabet.Type;
import company.nontermonal_alphabet.WhiteColumn;
import company.nontermonal_alphabet.WhiteRow;
import company.nontermonal_alphabet.nums.ZeroWhite;
import company.nontermonal_alphabet.nums.columns.two.OneOne;
import org.javatuples.Pair;

public class ZeroOneOne extends Type {
    private static ZeroOneOne zeroOneOne;

    public static ZeroOneOne getInstance(){
        if(zeroOneOne == null)
            zeroOneOne = new ZeroOneOne();
        return zeroOneOne;
    }

    private ZeroOneOne() {
        this.vRules = new Pair[]{new Pair<>(ZeroWhite.getInstance(), OneOne.getInstance()),
                Pair.with(this, WhiteRow.getInstance()), Pair.with(WhiteRow.getInstance(), this)};
        this.hRules = new Pair[]{Pair.with(this, WhiteColumn.getInstance()), Pair.with( WhiteColumn.getInstance(), this)};
        this.rename = new Type[]{};
    }
}
