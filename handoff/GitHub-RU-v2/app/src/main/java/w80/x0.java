package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x0 {
    public final int a;

    public x0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && this.a == ((x0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Refs(totalCount=", this.a, ")");
    }
}
