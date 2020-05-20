package company.nontermonal_alphabet;

import company.SubClass;
import company.ValueClass;
import org.javatuples.Pair;

import java.util.Map;

public abstract class Type {
    protected Pair<Type, Type>[] vRules;
    protected Pair<Type, Type>[] hRules;
    protected Type[] rename;

    public Pair<Integer, byte[][]> check(byte[][] image, Map<SubClass, ValueClass> cache, int[] vBorders, int[] hBorders) {
        SubClass subClass = new SubClass(hBorders, vBorders, this.getClass());
        ValueClass result = cache.get(subClass);
        if (result != null) {
            return new Pair<>(result.min, result.image);
        }

        Pair<Integer, byte[][]> horizontal = checkHorizontal(image, cache, hBorders, vBorders);
        Pair<Integer, byte[][]> vertical = checkVertical(image, cache, hBorders, vBorders);
        Pair<Integer, byte[][]> rename = checkRename(image, cache, hBorders, vBorders);

        if (horizontal.getValue0() < vertical.getValue0()) {
            if (horizontal.getValue0() < rename.getValue0()) {
                return setResult(horizontal, cache, hBorders, vBorders);
            } else {
                return setResult(rename, cache, hBorders, vBorders);
            }
        } else if (vertical.getValue0() < rename.getValue0()) {
            return setResult(vertical, cache, hBorders, vBorders);
        } else return setResult(rename, cache, hBorders, vBorders);
    }

    private Pair<Integer, byte[][]> checkHorizontal(byte[][] image, Map<SubClass, ValueClass> cache, int[] hBorders, int[] vBorders) {
        int min = 10_000;
        byte[][] resultImage = new byte[0][0];
        for (int i = hBorders[0]; i < hBorders[1] ; i++) {
            for (Pair<Type, Type> hRule : hRules) {
                Pair<Integer, byte[][]> left = hRule.getValue0().check(image, cache, vBorders, new int[]{hBorders[0], i});
                if (left.getValue0() > min)
                    continue;
                Pair<Integer, byte[][]> right = hRule.getValue1().check(image, cache, vBorders, new int[]{i + 1, hBorders[1]});
                int r1 = left.getValue0() + right.getValue0();
                r1 = Math.abs(r1);
                if (r1 < min) {
                    min = r1;

                    byte[][] concatenated = new byte[left.getValue1().length][left.getValue1()[0].length + right.getValue1()[0].length];
                    for (int lefti = 0; lefti < left.getValue1().length; lefti++) {
                        System.arraycopy(left.getValue1()[lefti], 0, concatenated[lefti], 0, left.getValue1()[0].length);
                        System.arraycopy(right.getValue1()[lefti], 0, concatenated[lefti], left.getValue1()[0].length, right.getValue1()[0].length);
                    }
                    resultImage = concatenated;
                }
            }
        }
        return new Pair<>(min, resultImage);
    }

    private Pair<Integer, byte[][]> checkVertical(byte[][] image, Map<SubClass, ValueClass> cache, int[] hBorders, int[] vBorders) {
        byte[][] resultImage = new byte[0][0];
        int min = 10_000;

        for (int i = vBorders[0]; i < vBorders[1] ; i++) {
            for (Pair<Type, Type> vRule : vRules) {
                Pair<Integer, byte[][]> left = vRule.getValue0().check(image, cache, new int[]{vBorders[0], i}, hBorders);
                if (left.getValue0() > min)
                    continue;
                Pair<Integer, byte[][]> right = vRule.getValue1().check(image, cache, new int[]{i + 1, vBorders[1]}, hBorders);
                int r1 = left.getValue0() + right.getValue0();
                if (r1 < min) {
                    min = r1;

                    byte[][] concatenated = new byte[left.getValue1().length + right.getValue1().length][left.getValue1()[0].length];


                    for (int leftj = 0; leftj < left.getValue1()[0].length; leftj++) {
                        for (int lefti = 0; lefti < left.getValue1().length; lefti++) {
                            concatenated[lefti][leftj] = left.getValue1()[lefti][leftj];
                        }
                        for (int rightj = 0; rightj < right.getValue1().length; rightj++) {
                            concatenated[rightj + left.getValue1().length][leftj] = right.getValue1()[rightj][leftj];
                        }
                    }

                    resultImage = concatenated;
                }
            }
        }

        return new Pair<>(min, resultImage);
    }

    private Pair<Integer, byte[][]> checkRename(byte[][] image, Map<SubClass, ValueClass> cache, int[] hBorders, int[] vBorders) {
        if (rename.length == 0)
            return new Pair<>(10_000, new byte[hBorders[1]][vBorders[1]]);

        int min = 10_000;
        byte[][] resultImage = new byte[0][0];

        for (Type type : rename) {
            Pair<Integer, byte[][]> check = type.check(image, cache, vBorders, hBorders);

            if (check.getValue0() < min) {
                min = check.getValue0();
                resultImage = check.getValue1();
            }
        }

        return new Pair<>(min, resultImage);
    }

    private Pair<Integer, byte[][]> setResult(Pair<Integer, byte[][]> horizontal, Map<SubClass, ValueClass> cache, int[] hBorders, int[] vBorders){
        Pair<Integer, byte[][]> res = new Pair<>(horizontal.getValue0(), horizontal.getValue1());
        SubClass subClass1 = new SubClass(hBorders, vBorders, this.getClass());
        ValueClass valueClass = new ValueClass(res.getValue1(), res.getValue0());
        cache.put(subClass1,valueClass);
        return res;
    }
}
