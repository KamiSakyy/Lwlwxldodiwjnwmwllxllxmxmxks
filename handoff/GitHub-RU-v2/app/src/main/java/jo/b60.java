package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b60 {
    public y50 a;

    public b60(y50 y50Var) {
        this.a = y50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b60) && k71.k.b(this.a, ((b60) obj).a);
    }

    public final int hashCode() {
        y50 y50Var = this.a;
        if (y50Var == null) {
            return 0;
        }
        return y50Var.hashCode();
    }

    public final String toString() {
        return "ReplaceActorsForAssignable(assignable=" + this.a + ")";
    }
}
