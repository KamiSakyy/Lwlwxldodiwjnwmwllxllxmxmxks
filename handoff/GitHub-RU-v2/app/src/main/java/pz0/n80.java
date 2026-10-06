package pz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n80 {
    public aa1.b a;
    public aa1.b b;
    public aa1.b c;
    public String d;
    public aa1.b e;

    public n80(aa.u0 u0Var, aa.u0 u0Var2, String str) {
        k71.k.g(str, "listId");
        aa.t0 t0Var = aa.t0.d;
        this.a = t0Var;
        this.b = u0Var;
        this.c = t0Var;
        this.d = str;
        this.e = u0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n80)) {
            return false;
        }
        n80 n80Var = (n80) obj;
        return k71.k.b(this.a, n80Var.a) && k71.k.b(this.b, n80Var.b) && k71.k.b(this.c, n80Var.c) && k71.k.b(this.d, n80Var.d) && k71.k.b(this.e, n80Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(f1.e.a(this.c, f1.e.a(this.b, this.a.hashCode() * 31, 31), 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder u = jo.f4Shadow.u("UpdateUserListInput(clientMutationId=", this.a, ", description=", this.b, ", isPrivate=");
        u.append(this.c);
        u.append(", listId=");
        u.append(this.d);
        u.append(", name=");
        return f1.e.k(u, this.e, ")");
    }

    public Object e;
}
