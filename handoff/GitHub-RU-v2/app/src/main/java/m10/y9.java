package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y9 {
    public aa1.b a;
    public aa1.b b;
    public aa1.b c;
    public String d;

    public y9(aa.u0 u0Var, String str) {
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
        if (!(obj instanceof y9)) {
            return false;
        }
        y9 y9Var = (y9) obj;
        return k71.k.b(this.a, y9Var.a) && k71.k.b(this.b, y9Var.b) && k71.k.b(this.c, y9Var.c) && k71.k.b(this.d, y9Var.d);
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
