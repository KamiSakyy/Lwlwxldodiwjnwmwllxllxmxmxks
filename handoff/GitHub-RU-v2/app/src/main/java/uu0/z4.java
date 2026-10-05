package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z4 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final y4 d;
    public final String e;

    public z4(String str, String str2, String str3, y4 y4Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = y4Var;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4)) {
            return false;
        }
        z4 z4Var = (z4) obj;
        return k71.k.b(this.a, z4Var.a) && k71.k.b(this.b, z4Var.b) && k71.k.b(this.c, z4Var.c) && k71.k.b(this.d, z4Var.d) && k71.k.b(this.e, z4Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("SimpleRepositoryFragment(name=", this.a, ", id=", this.b, ", url=");
        o.append(this.c);
        o.append(", owner=");
        o.append(this.d);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}
