package gn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j00 {
    public final aa1.b a;
    public final aa1.b b;
    public final aa1.b c;
    public final String d;
    public final aa1.b e;

    public j00(aa.u0 u0Var, aa.u0 u0Var2, String str) {
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
        if (!(obj instanceof j00)) {
            return false;
        }
        j00 j00Var = (j00) obj;
        return k71.k.b(this.a, j00Var.a) && k71.k.b(this.b, j00Var.b) && k71.k.b(this.c, j00Var.c) && k71.k.b(this.d, j00Var.d) && k71.k.b(this.e, j00Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(f1.e.a(this.c, f1.e.a(this.b, this.a.hashCode() * 31, 31), 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder u = jo.f4.u("UpdateUserListInput(clientMutationId=", this.a, ", description=", this.b, ", isPrivate=");
        u.append(this.c);
        u.append(", listId=");
        u.append(this.d);
        u.append(", name=");
        return f1.e.k(u, this.e, ")");
    }
}
