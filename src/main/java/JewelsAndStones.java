public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int num = 0;
        for (int i = 0; i < J.length(); i++) {
            for (int z = 0; z < S.length(); z++) {
                if (J.charAt(i) == S.charAt(z)) {
                    num++;
                }
            }
        }
        return num;
    }
}
