package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u80 {
    public final String a;
    public final w80 b;
    public final z80 c;

    public u80(String str, w80 w80Var, z80 z80Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = w80Var;
        this.c = z80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u80)) {
            return false;
        }
        u80 u80Var = (u80) obj;
        return k71.k.b(this.a, u80Var.a) && k71.k.b(this.b, u80Var.b) && k71.k.b(this.c, u80Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w80 w80Var = this.b;
        int hashCode2 = (hashCode + (w80Var == null ? 0 : w80Var.hashCode())) * 31;
        z80 z80Var = this.c;
        return hashCode2 + (z80Var != null ? z80Var.hashCode() : 0);
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
