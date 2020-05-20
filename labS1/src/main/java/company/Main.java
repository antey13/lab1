package company;

import company.nontermonal_alphabet.CorrectSum;
import company.nontermonal_alphabet.UnCorrectSum;
import org.javatuples.Pair;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        byte[][] image = new byte[][]{//1 0 1 0 1 + 0 0 1 0 1 = 1 1 1 1 0
                {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1},
                {0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1},
                {0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1},
                {0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1},
                {1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1},
                {0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1},
                {0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1},
                {0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1},

        };


        Map<SubClass, ValueClass> cache = new HashMap<>();


        long t1 = System.currentTimeMillis();
        CorrectSum correctSum = new CorrectSum();
        UnCorrectSum unCorrectSum = new UnCorrectSum();
        correctSum.setUp(unCorrectSum);
        unCorrectSum.setUp(correctSum);

        Pair<Integer, byte[][]> check = correctSum.check(image, cache, new int[]{0, image.length - 1}, new int[]{0, image[0].length - 1});
        System.out.println("Errors: "+check.getValue0());
        for (int i = 0; i < check.getValue1().length; i++) {
            for (int j = 0; j < check.getValue1()[0].length; j++) {
                System.out.print(check.getValue1()[i][j]);
            }
            System.out.println();
        }
        System.out.println("Time: "+(System.currentTimeMillis() - t1));
    }




}
