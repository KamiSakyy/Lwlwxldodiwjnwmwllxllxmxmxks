package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lc0 implements aa.m0 {
    public final nc0 a;

    public lc0(nc0 nc0Var) {
        this.a = nc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc0) && k71.k.b(this.a, ((lc0) obj).a);
    }

    public final int hashCode() {
        nc0 nc0Var = this.a;
        if (nc0Var == null) {
            return 0;
        }
        return nc0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDiscussion=" + this.a + ")";
    }
}
