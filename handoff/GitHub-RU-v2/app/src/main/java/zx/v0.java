package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v0 {
    public String a;
    public x0 b;
    public int c;
    public m0 d;

    public v0(String str, x0 x0Var, int i, m0 m0Var) {
        this.a = str;
        this.b = x0Var;
        this.c = i;
        this.d = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return k71.k.b(this.a, v0Var.a) && k71.k.b(this.b, v0Var.b) && this.c == v0Var.c && k71.k.b(this.d, v0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.s0.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "OnPullRequest(id=" + this.a + ", requiredStatusChecks=" + this.b + ", actionRequiredWorkflowRunCount=" + this.c + ", commits=" + this.d + ")";
    }
}
