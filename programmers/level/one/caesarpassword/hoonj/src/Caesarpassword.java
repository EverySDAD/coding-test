public class Caesarpassword {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' '){
                int ascII = s.charAt(i) + n;
                if (ascII > 122 || (ascII > 90 && s.charAt(i) <= 90)) {
                    ascII -= 26;
                }
                answer.append((char) ascII);
            }else{
                answer.append(s.charAt(i));
            }
        }
        return answer.toString();
    }
}
