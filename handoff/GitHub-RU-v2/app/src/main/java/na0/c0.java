package na0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 {
    public String a;
    public e0 b;
    public int c;
    public t d;

    public c0(String str, e0 e0Var, int i, t tVar) {
        this.a = str;
        this.b = e0Var;
        this.c = i;
        this.d = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return k71.k.b(this.a, c0Var.a) && k71.k.b(this.b, c0Var.b) && this.c == c0Var.c && k71.k.b(this.d, c0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.s0.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "OnPullRequest(id=" + this.a + ", requiredStatusChecks=" + this.b + ", actionRequiredWorkflowRunCount=" + this.c + ", commits=" + this.d + ")";
    }
}
