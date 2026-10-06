package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t1 {
    public final int a;

    public t1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1) && this.a == ((t1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Issues(totalCount=", this.a, ")");
    }
}
