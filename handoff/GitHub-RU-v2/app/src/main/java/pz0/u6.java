package pz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u6 {
    public final aa1.b a;
    public final aa1.b b;
    public final aa1.b c;
    public final String d;

    public u6(aa.u0 u0Var, String str) {
        k71.k.g(str, "name");
        aa.t0 t0Var = aa.t0.d;
        this.a = t0Var;
        this.b = u0Var;
        this.c = t0Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj;
        return k71.k.b(this.a, u6Var.a) && k71.k.b(this.b, u6Var.b) && k71.k.b(this.c, u6Var.c) && k71.k.b(this.d, u6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f1.e.a(this.c, f1.e.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder u = jo.f4.u("CreateUserListInput(clientMutationId=", this.a, ", description=", this.b, ", isPrivate=");
        u.append(this.c);
        u.append(", name=");
        u.append(this.d);
        u.append(")");
        return u.toString();
    }
}
