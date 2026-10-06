package dl0;

import ri0.u1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o {
    public String a;
    public mg0.g0 b;
    public u1 c;

    public o(String str, mg0.g0 g0Var, u1 u1Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = g0Var;
        this.c = u1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b) && k71.k.b(this.c, oVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mg0.g0 g0Var = this.b;
        int hashCode2 = (hashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        u1 u1Var = this.c;
        return hashCode2 + (u1Var != null ? u1Var.hashCode() : 0);
    }

    public final String toString() {
        return "LinkedIssuesOrPullRequest(__typename=" + this.a + ", linkedIssueFragment=" + this.b + ", linkedPullRequestFragment=" + this.c + ")";
    }
}
