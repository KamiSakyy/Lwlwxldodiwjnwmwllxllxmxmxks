package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ad0 implements aa.m0 {
    public final dd0 a;

    public ad0(dd0 dd0Var) {
        this.a = dd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ad0) && k71.k.b(this.a, ((ad0) obj).a);
    }

    public final int hashCode() {
        dd0 dd0Var = this.a;
        if (dd0Var == null) {
            return 0;
        }
        return dd0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateIssueIssueType=" + this.a + ")";
    }
}
