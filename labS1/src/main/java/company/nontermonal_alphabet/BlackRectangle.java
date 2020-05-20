package company.nontermonal_alphabet;

import company.BlackPixel;
import org.javatuples.Pair;

public class BlackRectangle extends Type {
    private static BlackRectangle blackRectangle;

    public static BlackRectangle getInstance() {
        if (blackRectangle == null)
            blackRectangle = new BlackRectangle();
        return blackRectangle;
    }

    private BlackRectangle() {
        this.vRules = new Pair[]{new Pair<>(BlackRow.getInstance(), this)};
        this.hRules = new Pair[]{new Pair<>(BlackColumn.getInstance(), this)};
        this.rename = new Type[]{BlackPixel.getInstance(), BlackRow.getInstance(), BlackColumn.getInstance()};
    }
}
