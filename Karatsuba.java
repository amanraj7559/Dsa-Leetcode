public class Karatsuba {

    int karatsuba(int n1, int n2) {

        if (n1 < 10 || n2 < 10) {
            return n1 * n2;
        }

        int m = Math.max(len(n1), len(n2));
        int hm = m / 2;

        int pow = (int) Math.pow(10, hm);

        int a = n1 / pow;
        int b = n1 % pow;
        int c = n2 / pow;
        int d = n2 % pow;

        int ac = karatsuba(a, c);
        int bd = karatsuba(b, d);
        int abcd = karatsuba(a + b, c + d);

        return (int)(ac * Math.pow(10, m) + (abcd - ac - bd) * Math.pow(10, hm) + bd);
    }

    int len(int n) {
        String s = n + "";
        return s.length();
    }
}