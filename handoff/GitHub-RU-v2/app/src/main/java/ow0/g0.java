package ow0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g0 {
    public final String a;
    public final i0 b;
    public final int c;
    public final x d;

    public g0(String str, i0 i0Var, int i, x xVar) {
        this.a = str;
        this.b = i0Var;
        this.c = i;
        this.d = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.a, g0Var.a) && k71.k.b(this.b, g0Var.b) && this.c == g0Var.c && k71.k.b(this.d, g0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.s0.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "OnPullRequest(id=" + this.a + ", requiredStatusChecks=" + this.b + ", actionRequiredWorkflowRunCount=" + this.c + ", commits=" + this.d + ")";
    }
}
