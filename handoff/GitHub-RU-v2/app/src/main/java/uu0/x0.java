package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x0 implements aa.h0 {
    public String a;
    public w0 b;
    public String c;
    public iy0.e1 d;

    public x0(String str, w0 w0Var, String str2, iy0.e1 e1Var) {
        this.a = str;
        this.b = w0Var;
        this.c = str2;
        this.d = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return k71.k.b(this.a, x0Var.a) && k71.k.b(this.b, x0Var.b) && k71.k.b(this.c, x0Var.c) && k71.k.b(this.d, x0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        return "ProjectIssueOrPullRequestProjectFragment(__typename=" + this.a + ", project=" + this.b + ", id=" + this.c + ", projectV2ViewItemFragment=" + this.d + ")";
    }
}
