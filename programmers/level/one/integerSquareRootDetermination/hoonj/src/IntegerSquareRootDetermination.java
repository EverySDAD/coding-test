public class IntegerSquareRootDetermination {
    public long solution(long n) {
        double value = Math.sqrt(n);
        if (value % 1 == 0) {
            return (long) Math.pow( value + 1,2) ;
        }else{
            return -1;
        }
    }
}
