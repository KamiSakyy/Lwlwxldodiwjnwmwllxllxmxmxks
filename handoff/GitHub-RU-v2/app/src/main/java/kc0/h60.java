package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h60 {
    public final g60 a;

    public h60(g60 g60Var) {
        this.a = g60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h60) && k71.k.b(this.a, ((h60) obj).a);
    }

    public final int hashCode() {
        g60 g60Var = this.a;
        if (g60Var == null) {
            return 0;
        }
        return g60Var.hashCode();
    }

    public final String toString() {
        return "UpdateIssueComment(issueComment=" + this.a + ")";
    }
}
