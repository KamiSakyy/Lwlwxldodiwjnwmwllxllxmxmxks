package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e5 {
    public final String a;
    public final f5 b;
    public final g5 c;

    public e5(String str, f5 f5Var, g5 g5Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = f5Var;
        this.c = g5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return k71.k.b(this.a, e5Var.a) && k71.k.b(this.b, e5Var.b) && k71.k.b(this.c, e5Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f5 f5Var = this.b;
        int hashCode2 = (hashCode + (f5Var == null ? 0 : f5Var.a.hashCode())) * 31;
        g5 g5Var = this.c;
        return hashCode2 + (g5Var != null ? g5Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
