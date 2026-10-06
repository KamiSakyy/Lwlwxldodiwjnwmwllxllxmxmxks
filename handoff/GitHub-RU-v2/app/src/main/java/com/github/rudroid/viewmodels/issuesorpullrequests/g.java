package com.github.rudroid.viewmodels.issuesorpullrequests;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public com.github.rudroid.utilities.ui.g1 a;
    public c6 b;

    public g(com.github.rudroid.utilities.ui.u0 u0Var) {
        this.a = u0Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c6 c6Var = this.b;
        return hashCode + (c6Var == null ? 0 : c6Var.hashCode());
    }

    public final String toString() {
        return "IssueOrPullRequestUiModel(listItems=" + this.a + ", reviewBanner=" + this.b + ")";
    }

    public g(com.github.rudroid.utilities.ui.g1 g1Var, c6 c6Var) {
        this.a = g1Var;
        this.b = c6Var;
    }
    public Object a(Object p1) { return null; }
}
