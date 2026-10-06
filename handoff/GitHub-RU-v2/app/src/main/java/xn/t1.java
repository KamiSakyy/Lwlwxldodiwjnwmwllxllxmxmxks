package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t1 extends w1Shadow {
    public double a;

    public t1(double d) {
        this.a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1) && Double.compare(this.a, ((t1) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final String toString() {
        return "NumberValue(value=" + this.a + ")";
    }
}
