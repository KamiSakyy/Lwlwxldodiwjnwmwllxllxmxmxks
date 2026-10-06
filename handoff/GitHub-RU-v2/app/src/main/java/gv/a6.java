package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a6 {
    public String a;
    public String b;
    public v5 c;
    public s5 d;
    public vx.a e;

    public a6(String str, String str2, v5 v5Var, s5 s5Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = v5Var;
        this.d = s5Var;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj;
        return k71.k.b(this.a, a6Var.a) && k71.k.b(this.b, a6Var.b) && k71.k.b(this.c, a6Var.c) && k71.k.b(this.d, a6Var.d) && k71.k.b(this.e, a6Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        v5 v5Var = this.c;
        int hashCode = (i + (v5Var == null ? 0 : v5Var.hashCode())) * 31;
        s5 s5Var = this.d;
        int hashCode2 = (hashCode + (s5Var == null ? 0 : s5Var.hashCode())) * 31;
        vx.a aVar = this.e;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Reviewer(__typename=", this.a, ", url=", this.b, ", onUser=");
        o.append(this.c);
        o.append(", onBot=");
        o.append(this.d);
        o.append(", nodeIdFragment=");
        return jo.f4.r(o, this.e, ")");
    }
}
