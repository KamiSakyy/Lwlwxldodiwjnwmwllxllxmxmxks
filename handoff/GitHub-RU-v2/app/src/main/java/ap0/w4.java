package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final v4 e;
    public final u4 f;
    public final cp0.g g;

    public w4(String str, String str2, String str3, String str4, v4 v4Var, u4 u4Var, cp0.g gVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = v4Var;
        this.f = u4Var;
        this.g = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj;
        return k71.k.b(this.a, w4Var.a) && k71.k.b(this.b, w4Var.b) && k71.k.b(this.c, w4Var.c) && k71.k.b(this.d, w4Var.d) && k71.k.b(this.e, w4Var.e) && k71.k.b(this.f, w4Var.f) && k71.k.b(this.g, w4Var.g);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
        v4 v4Var = this.e;
        int hashCode = (i + (v4Var == null ? 0 : v4Var.hashCode())) * 31;
        u4 u4Var = this.f;
        int hashCode2 = (hashCode + (u4Var == null ? 0 : u4Var.hashCode())) * 31;
        cp0.g gVar = this.g;
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
