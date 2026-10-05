package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o20 {
    public final String a;
    public final q20 b;
    public final t20 c;

    public o20(String str, q20 q20Var, t20 t20Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = q20Var;
        this.c = t20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o20)) {
            return false;
        }
        o20 o20Var = (o20) obj;
        return k71.k.b(this.a, o20Var.a) && k71.k.b(this.b, o20Var.b) && k71.k.b(this.c, o20Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q20 q20Var = this.b;
        int hashCode2 = (hashCode + (q20Var == null ? 0 : q20Var.hashCode())) * 31;
        t20 t20Var = this.c;
        return hashCode2 + (t20Var != null ? t20Var.hashCode() : 0);
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
