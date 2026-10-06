package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mb0 {
    public final nb0 a;

    public mb0(nb0 nb0Var) {
        this.a = nb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mb0) && k71.k.b(this.a, ((mb0) obj).a);
    }

    public final int hashCode() {
        nb0 nb0Var = this.a;
        if (nb0Var == null) {
            return 0;
        }
        return nb0Var.hashCode();
    }

    public final String toString() {
        return "UnminimizeComment(unminimizedComment=" + this.a + ")";
    }
}
