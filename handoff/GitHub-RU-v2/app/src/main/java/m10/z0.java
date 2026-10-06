package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z0 {
    public aa1.b a;
    public aa1.b b;
    public aa1.b c;
    public aa1.b d;
    public aa1.b e;

    public z0(aa1.b bVar, aa1.b bVar2, aa1.b bVar3, aa1.b bVar4, aa1.b bVar5) {
        this.a = bVar;
        this.b = bVar2;
        this.c = bVar3;
        this.d = bVar4;
        this.e = bVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return k71.k.b(this.a, z0Var.a) && k71.k.b(this.b, z0Var.b) && k71.k.b(this.c, z0Var.c) && k71.k.b(this.d, z0Var.d) && k71.k.b(this.e, z0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + f1.e.a(this.d, f1.e.a(this.c, f1.e.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder u = jo.f4Shadow.u("AgentAssignmentInput(baseRef=", this.a, ", customAgent=", this.b, ", customInstructions=");
        f1.e.w(u, this.c, ", model=", this.d, ", targetRepositoryId=");
        return f1.e.k(u, this.e, ")");
    }

    public Object e;
}
