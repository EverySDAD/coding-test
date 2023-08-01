public class EvenOdd {
    public String solution(int num) {
        if(Math.abs(num) % 2 == 1){
            return "Odd";
        } else {
            return "Even";
        }
    }
}
