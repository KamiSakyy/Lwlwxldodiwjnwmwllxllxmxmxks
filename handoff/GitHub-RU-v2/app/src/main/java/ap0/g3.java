package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g3 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final d3 g;
    public final f3 h;
    public final c3 i;
    public final gu0.c j;

    public g3(String str, String str2, String str3, String str4, String str5, String str6, d3 d3Var, f3 f3Var, c3 c3Var, gu0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = d3Var;
        this.h = f3Var;
        this.i = c3Var;
        this.j = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        return k71.k.b(this.a, g3Var.a) && k71.k.b(this.b, g3Var.b) && k71.k.b(this.c, g3Var.c) && k71.k.b(this.d, g3Var.d) && k71.k.b(this.e, g3Var.e) && k71.k.b(this.f, g3Var.f) && k71.k.b(this.g, g3Var.g) && k71.k.b(this.h, g3Var.h) && k71.k.b(this.i, g3Var.i) && k71.k.b(this.j, g3Var.j);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int i2 = com.github.rudroid.copilot.h1.i((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.f, 31);
        d3 d3Var = this.g;
        int hashCode2 = (this.h.hashCode() + ((i2 + (d3Var == null ? 0 : d3Var.hashCode())) * 31)) * 31;
        c3 c3Var = this.i;
        return this.j.hashCode() + ((hashCode2 + (c3Var != null ? c3Var.hashCode() : 0)) * 31);
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
