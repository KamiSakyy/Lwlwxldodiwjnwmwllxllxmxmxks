package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z0 implements aa.h0 {
    public String a;
    public y0 b;
    public String c;
    public f00.g1 d;

    public z0(String str, y0 y0Var, String str2, f00.g1 g1Var) {
        this.a = str;
        this.b = y0Var;
        this.c = str2;
        this.d = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return k71.k.b(this.a, z0Var.a) && k71.k.b(this.b, z0Var.b) && k71.k.b(this.c, z0Var.c) && k71.k.b(this.d, z0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        return "ProjectIssueOrPullRequestProjectFragment(__typename=" + this.a + ", project=" + this.b + ", id=" + this.c + ", projectV2ViewItemFragment=" + this.d + ")";
    }
}
