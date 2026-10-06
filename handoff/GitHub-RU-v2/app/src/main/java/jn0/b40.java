package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b40 {
    public y30 a;

    public b40(y30 y30Var) {
        this.a = y30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b40) && k71.k.b(this.a, ((b40) obj).a);
    }

    public final int hashCode() {
        y30 y30Var = this.a;
        if (y30Var == null) {
            return 0;
        }
        return y30Var.hashCode();
    }

    public final String toString() {
        return "ReplaceAssigneesForAssignable(assignable=" + this.a + ")";
    }
}
