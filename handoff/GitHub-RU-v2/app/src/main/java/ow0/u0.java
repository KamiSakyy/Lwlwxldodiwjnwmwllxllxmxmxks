package ow0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u0 {
    public String a;
    public v0 b;
    public w0 c;

    public u0(String str, v0 v0Var, w0 w0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = v0Var;
        this.c = w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return k71.k.b(this.a, u0Var.a) && k71.k.b(this.b, u0Var.b) && k71.k.b(this.c, u0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v0 v0Var = this.b;
        int hashCode2 = (hashCode + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        w0 w0Var = this.c;
        return hashCode2 + (w0Var != null ? w0Var.hashCode() : 0);
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
