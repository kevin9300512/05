class Compute extends MyMath {
    private int ans;

    public int add(int a, int b) {
        ans = super.add(a, b);
        return ans;
    }

    public int sub(int a, int b) {
        ans = super.sub(a, b);
        return ans;
    }

    public int mul(int a, int b) {
        ans = super.mul(a, b);
        return ans;
    }

    public int div(int a, int b) {
        ans = super.div(a, b);
        return ans;
    }

    public void show() {
        System.out.println("ans=" + ans);
    }
}

public class class1209 {
    public static void main(String avgs[]) {
        Compute cmp = new Compute();
        cmp.mul(3, 5);
        cmp.show();
    }
}
