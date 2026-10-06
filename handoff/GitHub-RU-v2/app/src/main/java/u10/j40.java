package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j40 {
    public final i40 a;

    public j40(i40 i40Var) {
        this.a = i40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j40) && k71.k.b(this.a, ((j40) obj).a);
    }

    public final int hashCode() {
        i40 i40Var = this.a;
        if (i40Var == null) {
            return 0;
        }
        return i40Var.hashCode();
    }

    public final String toString() {
        return "UpdateIssueComment(issueComment=" + this.a + ")";
    }
}
