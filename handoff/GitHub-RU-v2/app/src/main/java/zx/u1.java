package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u1 {
    public String a;
    public v1 b;
    public w1 c;

    public u1(String str, v1 v1Var, w1 w1Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = v1Var;
        this.c = w1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return k71.k.b(this.a, u1Var.a) && k71.k.b(this.b, u1Var.b) && k71.k.b(this.c, u1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v1 v1Var = this.b;
        int hashCode2 = (hashCode + (v1Var == null ? 0 : v1Var.hashCode())) * 31;
        w1 w1Var = this.c;
        return hashCode2 + (w1Var != null ? w1Var.hashCode() : 0);
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
