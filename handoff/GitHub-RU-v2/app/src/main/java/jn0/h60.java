package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h60 {
    public String a;
    public j60 b;
    public m60 c;

    public h60(String str, j60 j60Var, m60 m60Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = j60Var;
        this.c = m60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h60)) {
            return false;
        }
        h60 h60Var = (h60) obj;
        return k71.k.b(this.a, h60Var.a) && k71.k.b(this.b, h60Var.b) && k71.k.b(this.c, h60Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j60 j60Var = this.b;
        int hashCode2 = (hashCode + (j60Var == null ? 0 : j60Var.hashCode())) * 31;
        m60 m60Var = this.c;
        return hashCode2 + (m60Var != null ? m60Var.hashCode() : 0);
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
