package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c4 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final z3 g;
    public final b4 h;
    public final y3 i;
    public final pv.c j;

    public c4(String str, String str2, String str3, String str4, String str5, String str6, z3 z3Var, b4 b4Var, y3 y3Var, pv.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z3Var;
        this.h = b4Var;
        this.i = y3Var;
        this.j = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        return k71.k.b(this.a, c4Var.a) && k71.k.b(this.b, c4Var.b) && k71.k.b(this.c, c4Var.c) && k71.k.b(this.d, c4Var.d) && k71.k.b(this.e, c4Var.e) && k71.k.b(this.f, c4Var.f) && k71.k.b(this.g, c4Var.g) && k71.k.b(this.h, c4Var.h) && k71.k.b(this.i, c4Var.i) && k71.k.b(this.j, c4Var.j);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int i2 = com.github.rudroid.copilot.h1.i((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.f, 31);
        z3 z3Var = this.g;
        int hashCode2 = (this.h.hashCode() + ((i2 + (z3Var == null ? 0 : z3Var.hashCode())) * 31)) * 31;
        y3 y3Var = this.i;
        return this.j.hashCode() + ((hashCode2 + (y3Var != null ? y3Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ReleaseFeedFragment(__typename=", this.a, ", id=", this.b, ", url=");
        f1.e.x(o, this.c, ", name=", this.d, ", shortDescriptionHTML=");
        f1.e.x(o, this.e, ", tagName=", this.f, ", mentions=");
        o.append(this.g);
        o.append(", repository=");
        o.append(this.h);
        o.append(", discussion=");
        o.append(this.i);
        o.append(", reactionFragment=");
        o.append(this.j);
        o.append(")");
        return o.toString();
    }

    public Object e;
}
