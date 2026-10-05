package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x8 {
    public final g6 a;
    public final aa1.b b;
    public final String c;
    public final aa1.b d;
    public final f6 e;

    public x8(g6 g6Var, String str, aa.u0 u0Var, f6 f6Var) {
        k71.k.g(str, "expectedHeadOid");
        this.a = g6Var;
        this.b = aa.t0.d;
        this.c = str;
        this.d = u0Var;
        this.e = f6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8)) {
            return false;
        }
        x8 x8Var = (x8) obj;
        return k71.k.b(this.a, x8Var.a) && k71.k.b(this.b, x8Var.b) && k71.k.b(this.c, x8Var.c) && k71.k.b(this.d, x8Var.d) && k71.k.b(this.e, x8Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + f1.e.a(this.d, com.github.rudroid.copilot.h1.i(f1.e.a(this.b, this.a.hashCode() * 31, 31), this.c, 31), 31);
    }

    public final String toString() {
        return "CreateCommitOnBranchInput(branch=" + this.a + ", clientMutationId=" + this.b + ", expectedHeadOid=" + this.c + ", fileChanges=" + this.d + ", message=" + this.e + ")";
    }
}
