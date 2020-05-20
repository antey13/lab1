package company;

import company.nontermonal_alphabet.Type;
import org.javatuples.Pair;

import java.util.Map;

public class BlackPixel extends Type {
    private static BlackPixel blackPixel;

    public static BlackPixel getInstance(){
        if(blackPixel == null)
            blackPixel = new BlackPixel();
        return blackPixel;
    }

    private BlackPixel() {
    }

    @Override
    public Pair<Integer,byte[][]> check(byte[][] image, Map<Main.SubClass, Main.ValueClass> cache, int[] hBorders, int[] vBorders) {
        if (hBorders[0] != hBorders[1] || vBorders[0] != vBorders[1]) {
            return new Pair<>(10_000, new byte[hBorders[1]][vBorders[1]]);
        }

        return new Pair<>(Math.abs(image[hBorders[0]][vBorders[0]] -1), new byte[][]{{1}});
    }
}
