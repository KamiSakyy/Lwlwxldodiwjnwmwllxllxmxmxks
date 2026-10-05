package dl0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l0 {
    public final String a;
    public final m0 b;
    public final n0 c;

    public l0(String str, m0 m0Var, n0 n0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = m0Var;
        this.c = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return k71.k.b(this.a, l0Var.a) && k71.k.b(this.b, l0Var.b) && k71.k.b(this.c, l0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m0 m0Var = this.b;
        int hashCode2 = (hashCode + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        n0 n0Var = this.c;
        return hashCode2 + (n0Var != null ? n0Var.hashCode() : 0);
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
