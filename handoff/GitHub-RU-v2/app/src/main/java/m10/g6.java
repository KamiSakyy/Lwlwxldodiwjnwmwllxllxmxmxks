package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g6 {
    public aa1.b a;
    public final aa1.b b = aa.t0.d;
    public aa1.b c;

    public g6(aa.u0 u0Var, aa1.b bVar) {
        this.a = u0Var;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6)) {
            return false;
        }
        g6 g6Var = (g6) obj;
        return k71.k.b(this.a, g6Var.a) && k71.k.b(this.b, g6Var.b) && k71.k.b(this.c, g6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f1.e.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return f1.e.k(jo.f4Shadow.u("CommittableBranch(branchName=", this.a, ", id=", this.b, ", repositoryNameWithOwner="), this.c, ")");
    }
}
