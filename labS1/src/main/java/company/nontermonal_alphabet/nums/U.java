package company.nontermonal_alphabet.nums;

import company.nontermonal_alphabet.BlackColumn;
import company.nontermonal_alphabet.Type;
import org.javatuples.Pair;

public class U extends Type {
    private static U u;

    public static U getInstance(){
        if(u == null)
            u = new U();
        return u;
    }

    private U() {
        this.vRules = new Pair[]{};
        this.hRules = new Pair[]{new Pair<>(BlackColumn.getInstance(), J.getInstance())};
        this.rename = new Type[]{};
    }
}
