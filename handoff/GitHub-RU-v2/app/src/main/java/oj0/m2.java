package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m2 {
    public final String a;
    public final n2 b;
    public final o2 c;

    public m2(String str, n2 n2Var, o2 o2Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = n2Var;
        this.c = o2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return k71.k.b(this.a, m2Var.a) && k71.k.b(this.b, m2Var.b) && k71.k.b(this.c, m2Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        n2 n2Var = this.b;
        int hashCode2 = (hashCode + (n2Var == null ? 0 : n2Var.hashCode())) * 31;
        o2 o2Var = this.c;
        return hashCode2 + (o2Var != null ? o2Var.hashCode() : 0);
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
