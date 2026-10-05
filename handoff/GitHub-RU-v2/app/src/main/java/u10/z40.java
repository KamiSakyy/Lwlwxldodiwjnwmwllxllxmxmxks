package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z40 {
    public final y40 a;

    public z40(y40 y40Var) {
        this.a = y40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z40) && k71.k.b(this.a, ((z40) obj).a);
    }

    public final int hashCode() {
        y40 y40Var = this.a;
        if (y40Var == null) {
            return 0;
        }
        return y40Var.hashCode();
    }

    public final String toString() {
        return "UpdateIssue(issue=" + this.a + ")";
    }
}
