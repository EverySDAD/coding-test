public class FindKIM {

    public String solution(String[] seoul) {
        int index = -1;
        for (String name : seoul) {
            index++;
            if (name.equalsIgnoreCase("KIM")) {
                break;
            }
        }
        return "김서방은 " + index + "에 있다";
    }
}
