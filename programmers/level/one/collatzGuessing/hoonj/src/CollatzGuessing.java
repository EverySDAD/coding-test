public class CollatzGuessing {

    public int solution(int num) {
        int answer = 0;
        if(num == 1) return 0;
        long numl = num;
        while (numl != 1){
            if (numl % 2 == 0) {
                numl = numl / 2;
            }else {
                numl = numl * 3 + 1;
            }
            answer++;
            if(answer == 500){
                return -1;
            }
        }
        return answer;
    }
}
