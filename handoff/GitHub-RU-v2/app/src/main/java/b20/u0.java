package b20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u0 {
    public final int a;

    public u0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && this.a == ((u0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Artifacts(totalCount=", this.a, ")");
    }
}
