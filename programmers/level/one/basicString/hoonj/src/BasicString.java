public class BasicString {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        String[] split = s.split("");
        try {
            for (String s1 : split) {
                Integer.parseInt(s1);
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
