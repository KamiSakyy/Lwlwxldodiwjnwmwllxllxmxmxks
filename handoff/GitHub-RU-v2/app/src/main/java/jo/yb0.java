package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yb0 {
    public final xb0 a;

    public yb0(xb0 xb0Var) {
        this.a = xb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yb0) && k71.k.b(this.a, ((yb0) obj).a);
    }

    public final int hashCode() {
        xb0 xb0Var = this.a;
        if (xb0Var == null) {
            return 0;
        }
        return xb0Var.hashCode();
    }

    public final String toString() {
        return "UpdateDiscussion(discussion=" + this.a + ")";
    }
}
