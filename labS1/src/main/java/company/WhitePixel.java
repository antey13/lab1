package company;

import company.nontermonal_alphabet.Type;
import org.javatuples.Pair;

import java.util.Map;

public class WhitePixel extends Type {
    private static WhitePixel instance;

    public static WhitePixel getInstance(){
        if(instance == null)
            instance = new WhitePixel();
        return instance;
    }

    private WhitePixel() {

    }

    @Override
    public Pair<Integer, byte[][]> check(byte[][] image, Map<Main.SubClass, Main.ValueClass> cache, int[] hBorders, int[] vBorders) {
        if (hBorders[0] != hBorders[1] || vBorders[0] != vBorders[1]) {
            return new Pair<>(10_000, new byte[hBorders[1]][vBorders[1]]);
        }

        return new Pair<>((int) image[hBorders[1]][vBorders[1]], new byte[][]{{0}});
    }
}
