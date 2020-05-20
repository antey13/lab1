package company;

import company.nontermonal_alphabet.Type;

public class SubClass {
    public int[] hBorders;
    public int[] vBorders;
    public Class<? extends Type> type;

    public SubClass(int[] hBorders, int[] vBorders, Class<? extends Type> type) {
        this.hBorders = hBorders;
        this.vBorders = vBorders;
        this.type = type;
    }

    @Override
    public int hashCode() {
        return 31 * hBorders[0] + hBorders[1] + vBorders[0] + vBorders[1];
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SubClass) {
            SubClass subClass = (SubClass) obj;
            return subClass.hBorders[0] == hBorders[0] && subClass.hBorders[1] == hBorders[1]
                    && subClass.vBorders[0] == vBorders[0] && subClass.vBorders[1] == vBorders[1]
                    && subClass.type.equals(type);
        }
        return false;
    }
}