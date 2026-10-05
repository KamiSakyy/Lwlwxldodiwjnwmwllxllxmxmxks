package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x50 {
    public final w50 a;

    public x50(w50 w50Var) {
        this.a = w50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x50) && k71.k.b(this.a, ((x50) obj).a);
    }

    public final int hashCode() {
        w50 w50Var = this.a;
        if (w50Var == null) {
            return 0;
        }
        return w50Var.hashCode();
    }

    public final String toString() {
        return "UpdateDiscussion(discussion=" + this.a + ")";
    }
}
