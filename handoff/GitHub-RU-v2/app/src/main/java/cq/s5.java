package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final r5 e;
    public final q5 f;
    public final eq.g g;

    public s5(String str, String str2, String str3, String str4, r5 r5Var, q5 q5Var, eq.g gVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = r5Var;
        this.f = q5Var;
        this.g = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj;
        return k71.k.b(this.a, s5Var.a) && k71.k.b(this.b, s5Var.b) && k71.k.b(this.c, s5Var.c) && k71.k.b(this.d, s5Var.d) && k71.k.b(this.e, s5Var.e) && k71.k.b(this.f, s5Var.f) && k71.k.b(this.g, s5Var.g);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
        r5 r5Var = this.e;
        int hashCode = (i + (r5Var == null ? 0 : r5Var.hashCode())) * 31;
        q5 q5Var = this.f;
        int hashCode2 = (hashCode + (q5Var == null ? 0 : q5Var.hashCode())) * 31;
        eq.g gVar = this.g;
        return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Owner(__typename=", this.a, ", id=", this.b, ", login=");
        f1.e.x(o, this.c, ", url=", this.d, ", onUser=");
        o.append(this.e);
        o.append(", onOrganization=");
        o.append(this.f);
        o.append(", avatarFragment=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
