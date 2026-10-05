package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r1 extends w1 {
    public final boolean a;

    public r1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1) && this.a == ((r1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("BooleanValue(value=", ")", this.a);
    }
}
