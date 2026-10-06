package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dd0 {
    public bd0 a;

    public dd0(bd0 bd0Var) {
        this.a = bd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd0) && k71.k.b(this.a, ((dd0) obj).a);
    }

    public final int hashCode() {
        bd0 bd0Var = this.a;
        if (bd0Var == null) {
            return 0;
        }
        return bd0Var.hashCode();
    }

    public final String toString() {
        return "UpdateIssueIssueType(issue=" + this.a + ")";
    }
}
