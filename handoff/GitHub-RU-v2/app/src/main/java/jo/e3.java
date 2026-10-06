package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e3 {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public String e;
    public boolean f;
    public eq.g g;

    public e3(eq.g gVar, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = z2;
        this.g = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return k71.k.b(this.a, e3Var.a) && k71.k.b(this.b, e3Var.b) && k71.k.b(this.c, e3Var.c) && this.d == e3Var.d && k71.k.b(this.e, e3Var.e) && this.f == e3Var.f && k71.k.b(this.g, e3Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), this.e, 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnBot(__typename=", this.a, ", id=", this.b, ", displayName=");
        com.github.rudroid.m0.x(o, this.c, ", isCopilot=", this.d, ", login=");
        com.github.rudroid.m0.x(o, this.e, ", isAgent=", this.f, ", avatarFragment=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
