package zx;

import gv.e2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 {
    public final String a;
    public final ct.q0 b;
    public final e2 c;

    public c0(String str, ct.q0 q0Var, e2 e2Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = q0Var;
        this.c = e2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return k71.k.b(this.a, c0Var.a) && k71.k.b(this.b, c0Var.b) && k71.k.b(this.c, c0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ct.q0 q0Var = this.b;
        int hashCode2 = (hashCode + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        e2 e2Var = this.c;
        return hashCode2 + (e2Var != null ? e2Var.hashCode() : 0);
    }

    public final String toString() {
        return "LinkedIssuesOrPullRequest(__typename=" + this.a + ", linkedIssueFragment=" + this.b + ", linkedPullRequestFragment=" + this.c + ")";
    }
}
