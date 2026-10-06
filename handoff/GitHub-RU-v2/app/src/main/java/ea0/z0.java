package ea0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z0 implements aa.h0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final y0 e;
    public final String f;
    public final String g;

    public z0(String str, String str2, boolean z, String str3, y0 y0Var, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = y0Var;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return k71.k.b(this.a, z0Var.a) && k71.k.b(this.b, z0Var.b) && this.c == z0Var.c && k71.k.b(this.d, z0Var.d) && k71.k.b(this.e, z0Var.e) && k71.k.b(this.f, z0Var.f) && k71.k.b(this.g, z0Var.g);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        String str = this.d;
        return this.g.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.e.a, (e + (str == null ? 0 : str.hashCode())) * 31, 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("UserListFragment(id=", this.a, ", name=", this.b, ", isPrivate=");
        com.github.rudroid.m0.z(o, this.c, ", description=", this.d, ", items=");
        o.append(this.e);
        o.append(", slug=");
        o.append(this.f);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.g, ")");
    }
}
