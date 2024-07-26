import java.util.StringJoiner;

public class movechar {
    public static void moveString(String str, int ind, int count, StringJoiner nstr) {
        int len = str.length();
        if (ind == len) {
            for (int i = 0; i < count; i++) {
                nstr.add("j");
            }
            System.out.println(nstr.toString());
            return;
        }
        char current = str.charAt(ind);
        if (current == 'j') {
            count++;
        } else {
            nstr.add(String.valueOf(current));
        }
        moveString(str, ind + 1, count, nstr);
    }

    public static void main(String[] args) {
        String str1 = "jstjjljip";
        StringJoiner nstr = new StringJoiner("");
        moveString(str1, 0, 0, nstr);
    }
}