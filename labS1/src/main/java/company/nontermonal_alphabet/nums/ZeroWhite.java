package company.nontermonal_alphabet.nums;

import company.nontermonal_alphabet.BlackRow;
import company.nontermonal_alphabet.Type;
import company.nontermonal_alphabet.WhiteColumn;
import company.nontermonal_alphabet.WhiteRow;
import org.javatuples.Pair;

public class ZeroWhite extends Type {
    private static ZeroWhite zeroWhite;

    public static ZeroWhite getInstance() {
        if(zeroWhite == null)
            zeroWhite = new ZeroWhite();
        return zeroWhite;
    }

    private ZeroWhite() {
        this.vRules = new Pair[]{new Pair<>(this, WhiteRow.getInstance()), new Pair<>(WhiteRow.getInstance(), this), new Pair<>(BlackRow.getInstance(), U.getInstance())};
        this.hRules = new Pair[]{new Pair<>(WhiteColumn.getInstance(), this), new Pair<>(this, WhiteColumn.getInstance())};
        this.rename = new Type[]{};
    }
}
