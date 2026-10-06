package gn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i5 {
    public l4 a;
    public aa1.b b;
    public String c;
    public aa1.b d;
    public k4 e;

    public i5(l4 l4Var, String str, aa.u0 u0Var, k4 k4Var) {
        k71.k.g(str, "expectedHeadOid");
        this.a = l4Var;
        this.b = aa.t0.d;
        this.c = str;
        this.d = u0Var;
        this.e = k4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return k71.k.b(this.a, i5Var.a) && k71.k.b(this.b, i5Var.b) && k71.k.b(this.c, i5Var.c) && k71.k.b(this.d, i5Var.d) && k71.k.b(this.e, i5Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + f1.e.a(this.d, com.github.rudroid.copilot.h1.i(f1.e.a(this.b, this.a.hashCode() * 31, 31), this.c, 31), 31);
    }

    public final String toString() {
        return "CreateCommitOnBranchInput(branch=" + this.a + ", clientMutationId=" + this.b + ", expectedHeadOid=" + this.c + ", fileChanges=" + this.d + ", message=" + this.e + ")";
    }

    public Object e;
}
