public class GCDLCM {
    public int[] solution(int n, int m) {
        int bigger = Math.max(n,m);
        int smaller = Math.min(n,m);

        return new int[]{gcd(bigger,smaller), lcm(bigger,smaller)};
    }

    int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    int lcm(int a, int b) {
        int g = gcd(a, b);
        return (a * b) / g;
    }
}
