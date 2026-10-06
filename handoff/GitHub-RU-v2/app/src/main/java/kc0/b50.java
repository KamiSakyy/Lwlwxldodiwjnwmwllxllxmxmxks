package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b50 {
    public final c50 a;

    public b50(c50 c50Var) {
        this.a = c50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b50) && k71.k.b(this.a, ((b50) obj).a);
    }

    public final int hashCode() {
        c50 c50Var = this.a;
        if (c50Var == null) {
            return 0;
        }
        return c50Var.hashCode();
    }

    public final String toString() {
        return "UnminimizeComment(unminimizedComment=" + this.a + ")";
    }
}
