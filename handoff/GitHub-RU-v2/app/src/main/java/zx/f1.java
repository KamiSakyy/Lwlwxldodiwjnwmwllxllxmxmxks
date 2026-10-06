package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f1Shadow {
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public eq.g g;

    public f1(eq.g gVar, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1Shadow)) {
            return false;
        }
        f1Shadow f1Var = (f1Shadow) obj;
        return k71.k.b(this.a, f1Var.a) && k71.k.b(this.b, f1Var.b) && k71.k.b(this.c, f1Var.c) && k71.k.b(this.d, f1Var.d) && this.e == f1Var.e && this.f == f1Var.f && k71.k.b(this.g, f1Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + x.i.e(x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnBot(__typename=", this.a, ", id=", this.b, ", displayName=");
        f1.e.x(o, this.c, ", login=", this.d, ", isCopilot=");
        com.github.rudroid.m0.A(o, this.e, ", isAgent=", this.f, ", avatarFragment=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
