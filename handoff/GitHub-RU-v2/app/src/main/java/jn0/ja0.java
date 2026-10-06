package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ja0 {
    public final ia0 a;

    public ja0(ia0 ia0Var) {
        this.a = ia0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ja0) && k71.k.b(this.a, ((ja0) obj).a);
    }

    public final int hashCode() {
        ia0 ia0Var = this.a;
        if (ia0Var == null) {
            return 0;
        }
        return ia0Var.hashCode();
    }

    public final String toString() {
        return "UpdateIssueComment(issueComment=" + this.a + ")";
    }
}
