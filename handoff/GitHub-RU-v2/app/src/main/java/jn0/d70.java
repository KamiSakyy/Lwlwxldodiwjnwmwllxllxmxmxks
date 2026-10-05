package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d70 {
    public final c70 a;

    public d70(c70 c70Var) {
        this.a = c70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d70) && k71.k.b(this.a, ((d70) obj).a);
    }

    public final int hashCode() {
        c70 c70Var = this.a;
        if (c70Var == null) {
            return 0;
        }
        return c70Var.hashCode();
    }

    public final String toString() {
        return "UnresolveReviewThread(thread=" + this.a + ")";
    }
}
