package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pd0 {
    public final od0 a;

    public pd0(od0 od0Var) {
        this.a = od0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd0) && k71.k.b(this.a, ((pd0) obj).a);
    }

    public final int hashCode() {
        od0 od0Var = this.a;
        if (od0Var == null) {
            return 0;
        }
        return od0Var.hashCode();
    }

    public final String toString() {
        return "UpdateIssue(issue=" + this.a + ")";
    }
}
