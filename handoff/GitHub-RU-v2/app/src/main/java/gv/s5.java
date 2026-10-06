package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final eq.g g;

    public s5(eq.g gVar, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
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
        return k71.k.b(this.a, s5Var.a) && k71.k.b(this.b, s5Var.b) && k71.k.b(this.c, s5Var.c) && k71.k.b(this.d, s5Var.d) && this.e == s5Var.e && k71.k.b(this.f, s5Var.f) && k71.k.b(this.g, s5Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e), this.f, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnBot(__typename=", this.a, ", id=", this.b, ", login=");
        f1.e.x(o, this.c, ", displayName=", this.d, ", isCopilot=");
        com.github.rudroid.m0.z(o, this.e, ", url=", this.f, ", avatarFragment=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
