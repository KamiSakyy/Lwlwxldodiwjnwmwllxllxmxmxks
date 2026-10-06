package pz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x5 {
    public final a5Shadow a;
    public final aa1.b b;
    public final String c;
    public final aa1.b d;
    public final z4 e;

    public x5(a5Shadow a5Var, String str, aa.u0 u0Var, z4 z4Var) {
        k71.k.g(str, "expectedHeadOid");
        this.a = a5Var;
        this.b = aa.t0.d;
        this.c = str;
        this.d = u0Var;
        this.e = z4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj;
        return k71.k.b(this.a, x5Var.a) && k71.k.b(this.b, x5Var.b) && k71.k.b(this.c, x5Var.c) && k71.k.b(this.d, x5Var.d) && k71.k.b(this.e, x5Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + f1.e.a(this.d, com.github.rudroid.copilot.h1.i(f1.e.a(this.b, this.a.hashCode() * 31, 31), this.c, 31), 31);
    }

    public final String toString() {
        return "CreateCommitOnBranchInput(branch=" + this.a + ", clientMutationId=" + this.b + ", expectedHeadOid=" + this.c + ", fileChanges=" + this.d + ", message=" + this.e + ")";
    }
}
