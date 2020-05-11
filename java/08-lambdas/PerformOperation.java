public class PerformOperation {
    protected Operation p;

    PerformOperation(Operation p) {
        this.p = p;
    }

    boolean check(int x) {
        return p.check(x);
    }

    static boolean isOdd(int x) {
        return new PerformOperation((n) -> n % 2==1).check(x);
    }

    static boolean checkPrime(int x) {
        return new PerformOperation((n) -> {
            if (n == 1)
                return true;
            for (int i = 2; i < n / 2 + 1; i++) {
                if ((n % i) == 0)
                    return true;
            }
            return false;
        }).check(x);
        // return p.check(x);
    }

    static boolean isPalindrome(int x) {
        return new PerformOperation(n -> {
            int a = n, b = 0;
            while (a != 0) {
                b = b * 10 + a % 10;
                a /= 10;
            }
            return b == x;
        }).check(x);
    }
}