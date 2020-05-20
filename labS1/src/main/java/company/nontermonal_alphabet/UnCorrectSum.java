package company.nontermonal_alphabet;

import company.nontermonal_alphabet.nums.columns.triple.*;
import org.javatuples.Pair;

public class UnCorrectSum extends Type{
    public void setUp(CorrectSum cs) {
        this.hRules = new Pair[]{new Pair<>(this, ZeroOneZero.getInstance()),
                new Pair<>(this, OneOneOne.getInstance()),
                new Pair<>(cs, ZeroZeroOne.getInstance())};
        this.vRules = new Pair[]{};
        this.rename = new Type[]{ ZeroZeroOne.getInstance(), OneOneZero.getInstance(), OneOneOne.getInstance(), OneZeroZero.getInstance(), ZeroOneZero.getInstance()};
    }

}

