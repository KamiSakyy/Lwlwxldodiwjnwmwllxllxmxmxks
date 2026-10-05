package hc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y4 {
    public final b4 a;
    public final aa1.b b;
    public final String c;
    public final aa1.b d;
    public final a4 e;

    public y4(b4 b4Var, String str, aa.u0 u0Var, a4 a4Var) {
        k71.k.g(str, "expectedHeadOid");
        this.a = b4Var;
        this.b = aa.t0.d;
        this.c = str;
        this.d = u0Var;
        this.e = a4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        return k71.k.b(this.a, y4Var.a) && k71.k.b(this.b, y4Var.b) && k71.k.b(this.c, y4Var.c) && k71.k.b(this.d, y4Var.d) && k71.k.b(this.e, y4Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + f1.e.a(this.d, com.github.rudroid.copilot.h1.i(f1.e.a(this.b, this.a.hashCode() * 31, 31), this.c, 31), 31);
    }

    public final String toString() {
        return "CreateCommitOnBranchInput(branch=" + this.a + ", clientMutationId=" + this.b + ", expectedHeadOid=" + this.c + ", fileChanges=" + this.d + ", message=" + this.e + ")";
    }
}
