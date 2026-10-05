package wk0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g1 {
    public final int a;

    public g1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && this.a == ((g1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Following(totalCount=", this.a, ")");
    }
}
