package na0;

import z70.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o {
    public final String a;
    public final w50.e0 b;
    public final t1 c;

    public o(String str, w50.e0 e0Var, t1 t1Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = e0Var;
        this.c = t1Var;
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
        w50.e0 e0Var = this.b;
        int hashCode2 = (hashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        t1 t1Var = this.c;
        return hashCode2 + (t1Var != null ? t1Var.hashCode() : 0);
    }

    public final String toString() {
        return "LinkedIssuesOrPullRequest(__typename=" + this.a + ", linkedIssueFragment=" + this.b + ", linkedPullRequestFragment=" + this.c + ")";
    }
}
