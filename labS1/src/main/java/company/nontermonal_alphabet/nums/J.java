package company.nontermonal_alphabet.nums;

import company.nontermonal_alphabet.BlackRow;
import company.nontermonal_alphabet.Type;
import org.javatuples.Pair;

public class J extends Type {
    private static J j;

    public static J getInstance(){
        if(j == null)
            j = new J();
        return j;
    }

    private J() {
        this.vRules = new Pair[]{new Pair<>(WhiteRecBlackColumn.getInstance(),BlackRow.getInstance())};
        this.hRules = new Pair[]{};
        this.rename = new Type[]{};
    }
}
