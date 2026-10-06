package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t5 implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public s5 d;
    public boolean e;
    public String f;
    public o5 g;
    public String h;

    public t5(String str, String str2, String str3, s5 s5Var, boolean z, String str4, o5 o5Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = s5Var;
        this.e = z;
        this.f = str4;
        this.g = o5Var;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return k71.k.b(this.a, t5Var.a) && k71.k.b(this.b, t5Var.b) && k71.k.b(this.c, t5Var.c) && k71.k.b(this.d, t5Var.d) && this.e == t5Var.e && k71.k.b(this.f, t5Var.f) && k71.k.b(this.g, t5Var.g) && k71.k.b(this.h, t5Var.h);
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
