package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x4 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final w4 d;
    public final boolean e;
    public final String f;
    public final s4 g;
    public final String h;

    public x4(String str, String str2, String str3, w4 w4Var, boolean z, String str4, s4 s4Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = w4Var;
        this.e = z;
        this.f = str4;
        this.g = s4Var;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4)) {
            return false;
        }
        x4 x4Var = (x4) obj;
        return k71.k.b(this.a, x4Var.a) && k71.k.b(this.b, x4Var.b) && k71.k.b(this.c, x4Var.c) && k71.k.b(this.d, x4Var.d) && this.e == x4Var.e && k71.k.b(this.f, x4Var.f) && k71.k.b(this.g, x4Var.g) && k71.k.b(this.h, x4Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31, 31, this.e), this.f, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryFeedHeader(id=", this.a, ", name=", this.b, ", url=");
        o.append(this.c);
        o.append(", owner=");
        o.append(this.d);
        o.append(", usesCustomOpenGraphImage=");
        com.github.rudroid.m0.z(o, this.e, ", openGraphImageUrl=", this.f, ", lists=");
        o.append(this.g);
        o.append(", __typename=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
