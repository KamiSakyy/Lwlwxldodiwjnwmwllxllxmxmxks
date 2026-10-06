package hc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b4 {
    public aa1.b a;
    public final aa1.b b = aa.t0.d;
    public aa1.b c;

    public b4(aa.u0 u0Var, aa1.b bVar) {
        this.a = u0Var;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return k71.k.b(this.a, b4Var.a) && k71.k.b(this.b, b4Var.b) && k71.k.b(this.c, b4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f1.e.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return f1.e.k(jo.f4.u("CommittableBranch(branchName=", this.a, ", id=", this.b, ", repositoryNameWithOwner="), this.c, ")");
    }
}
