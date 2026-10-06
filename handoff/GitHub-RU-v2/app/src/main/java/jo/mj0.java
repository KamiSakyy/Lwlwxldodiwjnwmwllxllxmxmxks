package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mj0 {
    public final String a;
    public final oj0 b;
    public final pj0 c;

    public mj0(String str, oj0 oj0Var, pj0 pj0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = oj0Var;
        this.c = pj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj0)) {
            return false;
        }
        mj0 mj0Var = (mj0) obj;
        return k71.k.b(this.a, mj0Var.a) && k71.k.b(this.b, mj0Var.b) && k71.k.b(this.c, mj0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        oj0 oj0Var = this.b;
        int hashCode2 = (hashCode + (oj0Var == null ? 0 : oj0Var.a.hashCode())) * 31;
        pj0 pj0Var = this.c;
        return hashCode2 + (pj0Var != null ? pj0Var.hashCode() : 0);
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
