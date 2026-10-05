package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u3 {
    public final String a;
    public final v3 b;
    public final w3 c;

    public u3(String str, v3 v3Var, w3 w3Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = v3Var;
        this.c = w3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return k71.k.b(this.a, u3Var.a) && k71.k.b(this.b, u3Var.b) && k71.k.b(this.c, u3Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v3 v3Var = this.b;
        int hashCode2 = (hashCode + (v3Var == null ? 0 : v3Var.hashCode())) * 31;
        w3 w3Var = this.c;
        return hashCode2 + (w3Var != null ? w3Var.hashCode() : 0);
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
