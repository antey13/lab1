package company.nontermonal_alphabet;

import company.WhitePixel;
import org.javatuples.Pair;

public class WhiteRectangle extends Type {
    private static WhiteRectangle whiteRectangle;

    public static WhiteRectangle getInstance(){
        if(whiteRectangle == null)
            whiteRectangle = new WhiteRectangle();
        return whiteRectangle;
    }

    private WhiteRectangle() {
        this.vRules = new Pair[]{new Pair<>(WhiteRow.getInstance(),this)};
        this.hRules = new Pair[]{new Pair<>(WhiteColumn.getInstance(),this)};
        this.rename = new Type[]{WhitePixel.getInstance(), WhiteRow.getInstance(), WhiteColumn.getInstance()};
    }
}
