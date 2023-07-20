public class StrangeCharacter {

    public String solution(String s) {
        boolean chk = false;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            chk = s.charAt(i) != ' ' && !chk;
            if (chk) {
                answer.append(Character.toUpperCase(s.charAt(i)));
            } else if(!chk) {
                answer.append(Character.toLowerCase(s.charAt(i)));
            } else {
                answer.append(s.charAt(i));
            }
        }
        return answer.toString();
    }
}
