package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s1 extends w1Shadow {
    public final int a;

    public s1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1) && this.a == ((s1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("IntegerValue(value=", this.a, ")");
    }
}
