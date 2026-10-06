package fb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements aa.v0 {
    public n0 a;

    public d(n0 n0Var) {
        this.a = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && k71.k.b(this.a, ((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
