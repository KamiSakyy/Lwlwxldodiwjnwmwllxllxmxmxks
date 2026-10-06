package ow0;

import xt0.u1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s {
    public String a;
    public ur0.k0 b;
    public u1 c;

    public s(String str, ur0.k0 k0Var, u1 u1Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = k0Var;
        this.c = u1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && k71.k.b(this.b, sVar.b) && k71.k.b(this.c, sVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ur0.k0 k0Var = this.b;
        int hashCode2 = (hashCode + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        u1 u1Var = this.c;
        return hashCode2 + (u1Var != null ? u1Var.hashCode() : 0);
    }

    public final String toString() {
        return "LinkedIssuesOrPullRequest(__typename=" + this.a + ", linkedIssueFragment=" + this.b + ", linkedPullRequestFragment=" + this.c + ")";
    }
}
