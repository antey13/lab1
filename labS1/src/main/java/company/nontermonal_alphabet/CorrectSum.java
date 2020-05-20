package company.nontermonal_alphabet;


import company.nontermonal_alphabet.nums.columns.triple.*;
import org.javatuples.Pair;

public class CorrectSum extends Type {
    public void setUp(UnCorrectSum ucs) {
        this.hRules = new Pair[]{new Pair<>(this, OneZeroOne.getInstance()),
                new Pair<>(this, ZeroZeroZero.getInstance()),
                new Pair<>(ucs, OneOneZero.getInstance())};
        this.vRules = new Pair[]{};
        this.rename = new Type[]{ZeroZeroZero.getInstance(), ZeroOneOne.getInstance(), OneZeroOne.getInstance()};
    }
}
