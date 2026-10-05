package zx;

import gv.g6;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 {
    public final String a;
    public final yw.b b;
    public final g6 c;
    public final dw.e1 d;

    public h0(String str, yw.b bVar, g6 g6Var, dw.e1 e1Var) {
        this.a = str;
        this.b = bVar;
        this.c = g6Var;
        this.d = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return k71.k.b(this.a, h0Var.a) && k71.k.b(this.b, h0Var.b) && k71.k.b(this.c, h0Var.c) && k71.k.b(this.d, h0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OnPullRequest(__typename=" + this.a + ", subscribableFragment=" + this.b + ", repositoryNodeFragmentPullRequest=" + this.c + ", pullRequestV2ItemsFragment=" + this.d + ")";
    }
}
